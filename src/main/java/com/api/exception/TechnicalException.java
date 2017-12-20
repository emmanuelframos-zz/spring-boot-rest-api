package com.api.exception;

import com.api.enums.ExceptionMessages;

public class TechnicalException extends Exception {

    public TechnicalException(String msg) {
        super(msg);
    }

    public TechnicalException(ExceptionMessages exceptionMessages){
        this(exceptionMessages.getMessage());
    }

}