package com.api.parser;

import com.api.domain.ApplicationUser;
import com.api.web.rest.v1.resource.ApplicationUserResource;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ApplicationUserParser {

    public List<ApplicationUserResource> toResourceList(List<ApplicationUser> applicationUsers){
        List<ApplicationUserResource> applicationUsersResource = new ArrayList<>();

        applicationUsers.forEach(u -> {
            ApplicationUserResource applicationUserResource = new ApplicationUserResource();
            BeanUtils.copyProperties(u, applicationUserResource);
            applicationUsersResource.add(applicationUserResource);
        });

        return applicationUsersResource;
    }

    public ApplicationUser toDomain(ApplicationUserResource applicationUserResource){
        ApplicationUser applicationUser = new ApplicationUser();
        BeanUtils.copyProperties(applicationUserResource, applicationUser);
        return applicationUser;
    }
}