package com.api.web.rest.v1.controller;

import com.api.domain.ApplicationUser;
import com.api.parser.ApplicationUserParser;
import com.api.service.ApplicationUserService;
import com.api.web.rest.v1.resource.ApplicationUserResource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ApplicationUserRestController extends BaseRestController {

    private ApplicationUserParser applicationUserParser;

    private ApplicationUserService applicationUserService;

    public ApplicationUserRestController(ApplicationUserService applicationUserService, ApplicationUserParser applicationUserParser){
        this.applicationUserService = applicationUserService;
        this.applicationUserParser = applicationUserParser;
    }

    @GetMapping("/users")
    public List<ApplicationUserResource> getAllUsers() {
        List<ApplicationUser> applicationUsers = applicationUserService.getAllUsers();
        return applicationUserParser.toResourceList(applicationUsers);
    }

    @PostMapping("/users/register")
    public void register(@RequestBody ApplicationUserResource applicationUserResource) {
        applicationUserService.register(applicationUserParser.toDomain(applicationUserResource));
    }
}