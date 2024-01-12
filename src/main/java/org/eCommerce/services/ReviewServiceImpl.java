package org.eCommerce.services;

import org.eCommerce.data.model.Review;
import org.eCommerce.data.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewServiceImpl implements ReviewService{
    @Autowired
    ReviewRepository reviewRepository;
    @Override
    public Review userReview(String reviewId, String userId, String orderId, String review) {
        Review comment = new Review();

        comment.setReviewId(reviewId);
        comment.setUserId(userId);
        comment.setOrderId(orderId);
        comment.setReview(review);

        reviewRepository.save(comment);
        return comment;
    }

    @Override
    public List<Review> findAll() {
        return reviewRepository.findAll();
    }
}
