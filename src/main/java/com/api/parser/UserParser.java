package com.api.parser;

import com.api.domain.User;
import com.api.web.rest.v1.resource.UserResource;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserParser {

    public List<UserResource> toResourceList(List<User> users){
        List<UserResource> usersResource = new ArrayList<>();

        users.forEach(u -> {
            UserResource userResource = new UserResource();
            BeanUtils.copyProperties(u, userResource);
            usersResource.add(userResource);
        });

        return usersResource;
    }

    public User toDomain(UserResource userResource){
        User user = new User();
        BeanUtils.copyProperties(userResource, user);
        return user;
    }
}