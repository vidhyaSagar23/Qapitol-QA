package org.addressbook;

public class InvalidPatternException extends RuntimeException{
    private String message;

    public InvalidPatternException(String message){
        this.message=message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
