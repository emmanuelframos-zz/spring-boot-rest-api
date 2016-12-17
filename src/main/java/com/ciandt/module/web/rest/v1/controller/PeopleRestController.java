package com.ciandt.module.web.rest.v1.controller;

import com.ciandt.module.utils.PeopleUtils;
import com.ciandt.module.web.rest.v1.resource.PeopleResource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class PeopleRestController {

    private static Logger logger = LoggerFactory.getLogger(PeopleRestController.class);

    @RequestMapping(value = "/people", method = RequestMethod.GET)
    public ResponseEntity<List<PeopleResource>> getPeople() {
        logger.info("Getting people.");
        List<PeopleResource> people = PeopleUtils.getPeople();
        logger.info("Get people returned [{}] results.", people.size());

        return new ResponseEntity<>(people, HttpStatus.OK);
    }

    @RequestMapping(value = "/people/prize", method = RequestMethod.GET)
    public ResponseEntity<List<PeopleResource>> getPeoplePrize() {
        logger.info("Getting people prize.");
        List<PeopleResource> peoplePrize = PeopleUtils.getPeoplePrize();
        logger.info("Get people prize returned [{}] results.", peoplePrize.size());

        return new ResponseEntity<>(peoplePrize, HttpStatus.OK);
    }
}