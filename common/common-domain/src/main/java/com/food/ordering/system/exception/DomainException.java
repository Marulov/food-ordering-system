package com.food.ordering.system.exception;

public class DomainException extends RuntimeException {
    public DomainException(String message) {
        super(message);
    }

    protected DomainException(String message, Throwable cause) {
        super(message, cause);
    }
}