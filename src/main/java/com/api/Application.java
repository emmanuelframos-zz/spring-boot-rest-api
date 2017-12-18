package com.api;

import com.api.domain.People;
import com.api.repository.PeopleRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public CommandLineRunner populateDatabase(PeopleRepository repository) {
        return (args) -> {
            repository.save(new People("Jack", "Bauer"));
            repository.save(new People("Chloe", "O'Brian"));
            repository.save(new People("Kim", "Bauer"));
            repository.save(new People("David", "Palmer"));
            repository.save(new People("Michelle", "Dessler"));
        };
    }
}
