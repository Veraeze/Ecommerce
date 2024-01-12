package org.eCommerce.data.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Review {
    @Id
    private String reviewId;
    private String userId;
    private String orderId;
    private String review;
}
