package com.mentor.api.controllers;

import com.mentor.api.com.mentor.api.models.MentRequest;
import com.mentor.api.com.mentor.api.models.PersonListResponse;
import com.mentor.api.com.mentor.api.models.PersonResponse;
import com.mentor.api.entities.Person;
import com.mentor.api.service.PersonService;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collections;
import java.util.List;

@RestController
public class PersonController {

    private final static Logger logger = LoggerFactory.getLogger(PersonController.class);



    @Autowired
    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/person/{id}")
    public PersonResponse getPersonDetails(@PathVariable("id") Integer personId) {
        logger.info("Request name: {}", "Get Person details by id.");

        logger.info("Person details by id: {}", personId);

        Person person = personService.getPersonDetailsService(personId);
        PersonResponse personResponse = new PersonResponse();
        personResponse.setPerson(person);
        return personResponse;
    }

    @PostMapping("/person/all")
    public PersonListResponse getAllPersonDetails(@RequestBody MentRequest mentRequest) {
        logger.info("Request name: {}", mentRequest.getRequestName());

        List<Integer> personIdList = mentRequest.getPersonIdList();
        logger.info("Fetch person details by list: {}", personIdList);
        List<Person> personList = null;
        if(CollectionUtils.isEmpty(personIdList)){
            personList = personService.getAllPersonListDetailsService();
        } else{
            personList = personService.getPersonListDetailsService(mentRequest.getPersonIdList());
        }

        PersonListResponse personListResponse = new PersonListResponse();
        personListResponse.setPersonList(personList);
        return personListResponse;
    }

    @PostMapping("/person/insert")
    public PersonResponse insertPerson(@RequestBody Person person){
        person = personService.insertSinglePersonService( person);
        PersonResponse pr = new PersonResponse();
        pr.setPerson(person);
        return pr;
    }
    
}
