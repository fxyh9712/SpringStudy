package com.fxyh.spring.exception;

public class CustomException extends RuntimeException {
    private static final long serialVersionUID = 5100311675985804166L;

    private String message;

    public CustomException(){}

    public CustomException(String message){
        super(message);
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
