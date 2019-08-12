package com.fxyh.springmvc.common;

public class CustomException extends RuntimeException {
    private static final long serialVersionUID = 4902874743631868805L;

    private String message;

    public CustomException() {
    }

    public CustomException(String message) {
        super(message);
        this.message = message;
    }
}
