package org.eCommerce.exceptions;

public class OrderIdNotFound extends RuntimeException{
    public OrderIdNotFound(String message) {
        super(message);
    }

}
