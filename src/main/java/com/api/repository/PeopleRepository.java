package com.api.repository;

import com.api.domain.People;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PeopleRepository extends JpaRepository <People, Long> {

    List<People> findByLastName(String lastName);

}
