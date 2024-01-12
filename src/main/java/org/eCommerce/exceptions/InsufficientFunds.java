package org.eCommerce.exceptions;

public class InsufficientFunds extends RuntimeException{
    public InsufficientFunds(String message) {
        super(message);
    }

}
