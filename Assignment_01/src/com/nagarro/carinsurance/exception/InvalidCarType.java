package com.nagarro.carinsurance.exception;

public class InvalidCarType extends RuntimeException{
    public InvalidCarType(String msg){
        super (msg);
    }
}
