package org.eCommerce.data.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

@Data
public class Order {
    @Id
    private String orderId;
    private Customer customerInfo;
    private  boolean isOrdered;
    private String productId;
    private LocalDateTime dateTime;
    private String userId;
}
