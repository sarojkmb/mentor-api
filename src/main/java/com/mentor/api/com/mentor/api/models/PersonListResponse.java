package com.mentor.api.com.mentor.api.models;

import com.mentor.api.entities.Person;
import lombok.Data;

import java.util.List;


@Data
public class PersonListResponse {

    private List<Person> personList;

}
