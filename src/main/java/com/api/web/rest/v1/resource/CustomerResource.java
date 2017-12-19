package com.api.web.rest.v1.resource;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CustomerResource {

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

    private CustomerResource(){ }

    public static CustomerResource build(){return new CustomerResource();}

    public CustomerResource login(String login){
        this.login = login;
        return this;
    }

    public CustomerResource name(String name){
        this.name = name;
        return this;
    }

    public CustomerResource age(Integer age){
        this.age = age;
        return this;
    }

    public CustomerResource birthDate(String birthDate){
        this.birthDate = birthDate;
        return this;
    }

    public CustomerResource photoUrl(String photoUrl){
        this.photoUrl = photoUrl;
        return this;
    }

    public CustomerResource salary(Double salary){
        this.salary = salary;
        return this;
    }

    public CustomerResource productivityMonths(List<ProductivityMonth> productivityMonths){
        this.productivityMonths = productivityMonths;
        return this;
    }

    public CustomerResource productivityAverage(){
        this.productivityAverage = (productivityMonths.stream().mapToDouble( month -> month.getValue()).sum() / productivityMonths.size());
        return this;
    }

    public Double getProductivityAverage(){
        return this.productivityAverage;
    }

    public CustomerResource prize(String prize){
        this.prize = prize;
        return this;
    }
}