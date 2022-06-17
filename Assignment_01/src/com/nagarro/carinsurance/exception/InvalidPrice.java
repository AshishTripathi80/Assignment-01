package com.nagarro.carinsurance.exception;

public class InvalidPrice extends RuntimeException{
    public InvalidPrice(String msg){
        super(msg);
    }
}
