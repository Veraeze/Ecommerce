package org.eCommerce.data.repository;

import org.eCommerce.data.model.Order;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderRepository extends MongoRepository<Order, String> {
    Order findOrderByOrderId(String id);

}
