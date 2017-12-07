package com.dojo.web.rest.v1.controller;

import com.dojo.utils.PeopleUtils;
import com.dojo.web.rest.v1.resource.PeopleResource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class PeopleRestController {

    private static Logger logger = LoggerFactory.getLogger(PeopleRestController.class);

    @GetMapping(value = "/people")
    public List<PeopleResource> getPeople() {
        logger.info("Getting people.");
        List<PeopleResource> people = PeopleUtils.getPeople();
        logger.info("Get people returned [{}] results.", people.size());

        return people;
    }


    @GetMapping(value = "/people/prize")
    public List<PeopleResource> getPeoplePrize() {
        logger.info("Getting people prize.");
        List<PeopleResource> peoplePrize = PeopleUtils.getPeoplePrize();
        logger.info("Get people prize returned [{}] results.", peoplePrize.size());

        return peoplePrize;
    }
}
