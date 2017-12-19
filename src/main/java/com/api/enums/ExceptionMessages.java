package com.api.enums;

public enum ExceptionMessages {

    GENERIC("An error occurred."),
    FORBIDDEN_RESOURCE("Forbidden resource."),
    RESOURCE_NOT_FOUND("Resource not found."),
    USER_NOT_FOUND("User not found.");

    private String message;

    ExceptionMessages(String message){
        this.message = message;
    }

    public String getMessage(){
        return message;
    }
}
