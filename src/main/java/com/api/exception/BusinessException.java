package com.api.exception;

import com.api.enums.ExceptionMessages;

public class BusinessException extends Exception {

    public BusinessException(String msg) {
        super(msg);
    }

    public BusinessException(ExceptionMessages exceptionMessages){
        this(exceptionMessages.getMessage());
    }

}