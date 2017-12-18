package com.api.web.rest.v1.controller;

import com.api.domain.User;
import com.api.parser.UserParser;
import com.api.service.UserService;
import com.api.web.rest.v1.resource.UserResource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserRestController extends BaseRestController {

    private UserParser userParser;

    private UserService userService;

    public UserRestController(UserService userService, UserParser userParser){
        this.userService = userService;
        this.userParser = userParser;
    }

    @GetMapping("/users")
    public @ResponseBody List<UserResource> getAllUsers() {
        List<User> users = userService.getAllUsers();
        return userParser.toResourceList(users);
    }

    @PostMapping("/users/register")
    public void register(@RequestBody UserResource userResource) {
        userService.register(userParser.toDomain(userResource));
    }
}