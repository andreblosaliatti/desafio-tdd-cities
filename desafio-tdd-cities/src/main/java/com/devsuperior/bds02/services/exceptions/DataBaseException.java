package com.devsuperior.bds02.services.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class DataBaseException extends RuntimeException {

    public DataBaseException(String message) {
        super(message);
    }
}
