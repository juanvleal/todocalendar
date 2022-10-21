package com.todocalendar.services.exceptions;

public class EmptyResultDataAccessException extends RuntimeException{

    public EmptyResultDataAccessException(String message) {
        super(message);
    }

}
