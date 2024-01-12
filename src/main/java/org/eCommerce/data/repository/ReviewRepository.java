package org.eCommerce.data.repository;

import org.eCommerce.data.model.Review;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ReviewRepository extends MongoRepository<Review, String> {
    Review findReviewByReviewId(String Id);

}
