package org.eCommerce.data.model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Wallet {
    private String userId;
    private BigDecimal balance = BigDecimal.ZERO;
}
