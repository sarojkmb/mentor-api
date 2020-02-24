package com.mentor.api.repo;

import com.mentor.api.entities.Expertise;
import com.mentor.api.entities.Interest;
import org.springframework.data.repository.CrudRepository;

public interface ExpertiseRepo extends CrudRepository<Expertise, Integer> {

}
