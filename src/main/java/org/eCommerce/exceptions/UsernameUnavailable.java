package org.eCommerce.exceptions;

public class UsernameUnavailable extends RuntimeException{
    public UsernameUnavailable(String message) {
        super(message);
    }

}
