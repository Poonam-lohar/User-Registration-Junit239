package com.bridgelabz;

public class UserRegistrationException extends Throwable {

    String message;

    public UserRegistrationException(String message){
        super(message);
    }
}
