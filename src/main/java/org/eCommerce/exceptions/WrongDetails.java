package org.eCommerce.exceptions;

public class WrongDetails extends RuntimeException{
    public WrongDetails(String message) {
        super(message);
    }

}
