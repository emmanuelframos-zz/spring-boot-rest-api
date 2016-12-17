package com.ciandt.module.web.rest.v1.resource;

import com.ciandt.module.enums.Months;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ProductivityMonth {

    @JsonProperty
    private Months month;

    @JsonProperty
    private Double value;

}