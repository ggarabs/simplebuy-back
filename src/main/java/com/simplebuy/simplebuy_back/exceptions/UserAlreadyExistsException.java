package com.simplebuy.simplebuy_back.exceptions;

public class UserAlreadyExistsException extends RuntimeException{
    public UserAlreadyExistsException(){ super("User already exists.");}

    public UserAlreadyExistsException(String message) { super(message);}
}