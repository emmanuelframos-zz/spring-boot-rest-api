package com.api.web.rest.v1.resource;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PeopleResource {

    @Setter(AccessLevel.NONE)
    private String login;

    @Setter(AccessLevel.NONE)
    private String name;

    @Setter(AccessLevel.NONE)
    private Integer age;

    @Setter(AccessLevel.NONE)
    private String birthDate;

    @Setter(AccessLevel.NONE)
    private String photoUrl;

    @Setter(AccessLevel.NONE)
    private Double salary;

    @Setter(AccessLevel.NONE)
    private List<ProductivityMonth> productivityMonths = new ArrayList<>();

    @Setter(AccessLevel.NONE)
    private Double productivityAverage;

    @Setter(AccessLevel.NONE)
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
