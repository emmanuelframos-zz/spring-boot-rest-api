package com.api.web.rest.v1.interceptor;

import com.api.exception.BusinessException;
import com.api.exception.TechnicalException;
import com.api.web.rest.v1.resource.ErrorResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler({BusinessException.class})
    public ResponseEntity<ErrorResource> handleBusinessException(BusinessException ex) {
        return new ResponseEntity<>(new ErrorResource(ex.getMessage()), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler({TechnicalException.class})
    public ResponseEntity<ErrorResource> handleTechnicalException(TechnicalException ex) {
        return new ResponseEntity<>(new ErrorResource(ex.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
    }

}