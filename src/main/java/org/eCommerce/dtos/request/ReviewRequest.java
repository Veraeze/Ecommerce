package org.eCommerce.dtos.request;

import lombok.Data;

@Data
public class ReviewRequest {
    private String userId;
    private String orderId;
    private String review;
}
