package com.mentor.api.service;

import com.mentor.api.repo.PersonRepo;
import com.mentor.api.entities.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;
import com.google.common.collect.Lists;


import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Objects;



@Service
public class PersonService {

    private final PersonRepo personRepo;

    @Autowired
    public PersonService(PersonRepo personRepo) {
        this.personRepo = personRepo;
    }

    @Transactional(isolation = Isolation.SERIALIZABLE)
    public Person getPersonDetailsService(Integer personId) {
        Objects.requireNonNull(personId);

        Person person = personRepo
                .findById(personId)
                .orElseThrow(() -> new EntityNotFoundException(String.valueOf(personId)));

        return person;
    }

    @Transactional(isolation = Isolation.SERIALIZABLE)
    public List<Person> getPersonListDetailsService(List<Integer> personIdList) {

        Iterable<Person> personIterator = personRepo.findByPersonIdIn(personIdList);
        List<Person> personList = Lists.newArrayList(personIterator);
        return personList;
    }

    @Transactional(isolation = Isolation.SERIALIZABLE)
    public List<Person> getAllPersonListDetailsService() {

        Iterable<Person> personIterator = personRepo.findAll();
        List<Person> personList = Lists.newArrayList(personIterator);
        return personList;
    }

    @Transactional(isolation = Isolation.SERIALIZABLE)
    public Person insertSinglePersonService(Person person){

        Integer nextPersonId = personRepo.getNextSeqPerson().intValue();
        person.setPersonId(nextPersonId);
        Person p = personRepo.save(person);
        return p;
    }



}
