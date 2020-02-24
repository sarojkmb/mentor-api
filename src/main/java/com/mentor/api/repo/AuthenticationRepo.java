package com.mentor.api.repo;

import com.mentor.api.entities.Authentication;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface AuthenticationRepo extends CrudRepository<Authentication, Integer> {

    public Authentication findByUsername(String username);


    @Query("select a from Authentication a where a.username=:username and a.password = (:password)")
    Authentication findByUsernamePassword(String username, String password);

    Authentication findByUsernameAndPassword(String username, String password);


}
