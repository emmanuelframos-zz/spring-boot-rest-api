package com.api.service;

import com.api.domain.People;
import com.api.repository.PeopleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PeopleService {

    @Autowired
    private PeopleRepository peopleRepository;

    public List<People> findByLastName(String lastName){
        return peopleRepository.findByLastName(lastName);
    }

}
