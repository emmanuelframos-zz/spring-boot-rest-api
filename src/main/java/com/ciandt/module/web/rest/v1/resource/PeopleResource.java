package com.ciandt.module.web.rest.v1.resource;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class PeopleResource {

    @JsonProperty
    private String login;

    @JsonProperty
    private String name;

    @JsonProperty
    private Integer age;

    @JsonProperty
    private String birthDate;

    @JsonProperty
    private String photoUrl;

    @JsonProperty
    private Double salary;

    @JsonProperty
    private List<ProductivityMonth> productivityMonths = new ArrayList<>();

    @JsonProperty
    private Double productivityAverage;

    @JsonProperty
    private String prize;

    private PeopleResource(){ }

    public static PeopleResource build(){return new PeopleResource();}

    public PeopleResource login(String login){
        this.login = login;
        return this;
    }

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

    public PeopleResource photoUrl(String photoUrl){
        this.photoUrl = photoUrl;
        return this;
    }

    public PeopleResource salary(Double salary){
        this.salary = salary;
        return this;
    }

    public PeopleResource productivityMonths(List<ProductivityMonth> productivityMonths){
        this.productivityMonths = productivityMonths;
        return this;
    }

    public PeopleResource productivityAverage(){
        this.productivityAverage = (productivityMonths.stream().mapToDouble( month -> month.getValue()).sum() / productivityMonths.size());
        return this;
    }

    public Double getProductivityAverage(){
        return this.productivityAverage;
    }

    public PeopleResource prize(String prize){
        this.prize = prize;
        return this;
    }
}