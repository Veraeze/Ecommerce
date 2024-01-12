package org.eCommerce.data.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.math.BigDecimal;

@Data
public class Product {
    @Id
    private String productId;
    private String productName;
    private int quantity;
    private BigDecimal unitCost = BigDecimal.ZERO;
}
