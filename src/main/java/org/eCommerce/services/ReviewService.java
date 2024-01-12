package org.eCommerce.services;

import org.eCommerce.data.model.Review;

import java.util.List;

public interface ReviewService {
    Review userReview(String reviewId, String userId, String orderId, String review);
    List<Review> findAll();
}
