package com.mentor.api.repo;

import com.mentor.api.entities.MyInterest;
import com.mentor.api.entities.Person;
import org.springframework.data.repository.CrudRepository;

public interface MyInterestRepo extends CrudRepository<MyInterest, Integer> {

}
