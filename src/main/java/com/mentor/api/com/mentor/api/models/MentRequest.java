package com.mentor.api.com.mentor.api.models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class MentRequest {

    private String requestName;

    private List<Integer> personIdList;


}
