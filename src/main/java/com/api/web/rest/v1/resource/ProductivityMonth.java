package com.api.web.rest.v1.resource;

import com.api.enums.Months;
import lombok.Data;

@Data
public class ProductivityMonth {

    private Months month;

    private Double value;

}
