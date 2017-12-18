package com.api.web.rest.v1.resource;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApplicationUserResource {

    private String username;

    private String password;

}