package com.mentor.api.service;

import com.mentor.api.repo.AuthenticationRepo;
import com.mentor.api.entities.Authentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Objects;


@Service
public class AuthenticationService {

    private final AuthenticationRepo authenticationRepo;

    @Autowired
    public AuthenticationService(AuthenticationRepo authenticationRepo) {
        this.authenticationRepo = authenticationRepo;
    }

    @Transactional(isolation = Isolation.SERIALIZABLE)
    public Authentication authenticateService(String username, String password) {
        Objects.requireNonNull(username, "username required.");
        //Objects.requireNonNull(password, "password required.");

//        authenticationRepo.finsByUsername("sarojkmb").forEach(x -> System.out.println(x));
        //Authentication auth = authenticationRepo.findByUsername("sarojkmb");

        Authentication auth = authenticationRepo.findByUsernameAndPassword(username, password);
        System.out.println("------------username: "+auth.getUsername());


        return null;

    }



}
