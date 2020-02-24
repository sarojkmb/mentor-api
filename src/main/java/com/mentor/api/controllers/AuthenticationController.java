package com.mentor.api.controllers;

import com.mentor.api.entities.Authentication;
import com.mentor.api.entities.Review;
import com.mentor.api.service.AuthenticationService;
import com.mentor.api.service.SimpleTeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityNotFoundException;

@RestController
public class AuthenticationController {

    @Autowired
    private final AuthenticationService authenticationService;

    @Autowired
    public AuthenticationController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    @PostMapping("/authentication/authenticate")
    public ResponseEntity addReview(@RequestBody Authentication authentication){

        try {
            authenticationService.authenticateService(authentication.getUsername(), authentication.getPassword());
            return ResponseEntity.ok().build();
        }
        catch (EntityNotFoundException e){
            return ResponseEntity.notFound().build();
        }


    }

}
