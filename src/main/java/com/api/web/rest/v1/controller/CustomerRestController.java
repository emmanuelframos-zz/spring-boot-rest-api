package com.api.web.rest.v1.controller;

import com.api.config.APIConfig;
import com.api.utils.CustomerUtils;
import com.api.web.rest.v1.resource.CustomerResource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerRestController extends BaseRestController {

    private static Logger logger = LoggerFactory.getLogger(CustomerRestController.class);

    private APIConfig apiConfig;

    public CustomerRestController(APIConfig apiConfig){
        this.apiConfig = apiConfig;
    }

    @GetMapping(value = "/customers")
    public List<CustomerResource> getCustomers() {

        logger.info("Getting customers in Rest API {}.", apiConfig.getName());
        List<CustomerResource> customers = CustomerUtils.getCustomers();
        logger.info("Get customer returned [{}] results.", customers.size());

        return customers;
    }


    @GetMapping(value = "/customers/prize")
    public List<CustomerResource> getCustomersPrize() {

        logger.info("Getting customers prize in Rest API {}.", apiConfig.getName());
        List<CustomerResource> customersPrize = CustomerUtils.getCustomersPrize();
        logger.info("Get customers prize returned [{}] results.", customersPrize.size());

        return customersPrize;
    }
}