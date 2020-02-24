package com.mentor.api.repo;

import com.mentor.api.entities.MyExpertise;
import com.mentor.api.entities.MyInterest;
import org.springframework.data.repository.CrudRepository;

public interface MyExpertiseRepo extends CrudRepository<MyExpertise, Integer> {

}
