package com.mentor.api.repo;

import com.mentor.api.entities.Person;
import com.mentor.api.entities.Teacher;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.UUID;

public interface PersonRepo extends CrudRepository<Person, Integer> {

    @Query(value = "SELECT nextval('seq_person')", nativeQuery = true)
    Long getNextSeqPerson();

//    @Query("select p from Person p where p.personId in :personIds")
//    List<Person>  getPersonListById(List<Integer> personIds);

    List<Person> findByPersonIdIn(List<Integer> personIds);



}
