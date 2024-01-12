package org.eCommerce.exceptions;

public class WrongUserId extends RuntimeException{
    public WrongUserId(String message) {
        super(message);
    }

}
