package com.api.parser;

import com.api.domain.ApplicationUser;
import com.api.web.rest.v1.resource.ApplicationUserResource;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ApplicationUserParser {

    public List<ApplicationUserResource> toResourceList(List<ApplicationUser> applicationUsers){
        return applicationUsers.stream().map(applicationUser -> {
            ApplicationUserResource applicationUserResource = new ApplicationUserResource();
            BeanUtils.copyProperties(applicationUser, applicationUserResource);
            return applicationUserResource;
        }).collect(Collectors.toList());
    }

    public ApplicationUser toDomain(ApplicationUserResource applicationUserResource){
        ApplicationUser applicationUser = new ApplicationUser();
        BeanUtils.copyProperties(applicationUserResource, applicationUser);
        return applicationUser;
    }
}