package org.eCommerce.data.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class ShoppingCart {
    @Id
    private String cartId;
    private String productId;
    private int quantity;
}
