package com.dojo.web.rest.v1.resource;

import com.dojo.enums.Months;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ProductivityMonth {

    @JsonProperty
    private Months month;

    @JsonProperty
    private Double value;

}
