package com.greatLearning.ticketAPI.exception;

public class ResourceNotFoundException extends Exception {
    private static final long serialVersionUID = 1L;

    public ResourceNotFoundException(Object resourceId) {
        super(resourceId != null ? resourceId.toString() : null);
    }
}