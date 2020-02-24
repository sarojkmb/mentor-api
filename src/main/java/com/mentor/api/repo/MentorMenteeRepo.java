package com.mentor.api.repo;

import com.mentor.api.entities.MentorMentee;
import com.mentor.api.entities.Person;
import org.springframework.data.repository.CrudRepository;

public interface MentorMenteeRepo extends CrudRepository<MentorMentee, Integer> {

}
