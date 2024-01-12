package org.eCommerce.data.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Shipping {
    @Id
    private String ShippingId;
    private String orderId;
    private boolean isShipped;

}
