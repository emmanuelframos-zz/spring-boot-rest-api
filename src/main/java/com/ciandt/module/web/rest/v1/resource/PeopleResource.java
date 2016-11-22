package com.ciandt.module.web.rest.v1.resource;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PeopleResource {

    @JsonProperty
    private String name;

    @JsonProperty
    private Integer age;

    @JsonProperty
    private String birthDate;

    @JsonProperty
    private String skill;

    @JsonProperty
    private String photoUrl;

    @JsonProperty
    private String salary;

    private PeopleResource(){ }

    public static PeopleResource build(){return new PeopleResource();}

    public PeopleResource name(String name){
        this.name = name;
        return this;
    }

    public PeopleResource age(Integer age){
        this.age = age;
        return this;
    }

    public PeopleResource birthDate(String birthDate){
        this.birthDate = birthDate;
        return this;
    }

    public PeopleResource skill(String skill){
        this.skill = skill;
        return this;
    }

    public PeopleResource photoUrl(String photoUrl){
        this.photoUrl = photoUrl;
        return this;
    }

    public PeopleResource salary(String salary){
        this.salary = salary;
        return this;
    }
}