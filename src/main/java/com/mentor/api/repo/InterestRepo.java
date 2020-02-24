package com.mentor.api.repo;

import com.mentor.api.entities.Interest;
import com.mentor.api.entities.Person;
import org.springframework.data.repository.CrudRepository;

public interface InterestRepo extends CrudRepository<Interest, Integer> {

}
