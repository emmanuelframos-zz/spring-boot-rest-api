package com.dojo.web.rest.v1.resource;

import com.dojo.enums.Months;
import lombok.Data;

@Data
public class ProductivityMonth {

    private Months month;

    private Double value;

}
