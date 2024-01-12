package org.eCommerce.services;

import org.eCommerce.data.model.Customer;
import org.eCommerce.data.model.Order;

import java.time.LocalDateTime;
import java.util.List;

public interface OrderService {
    Order order(String orderId, Customer customerInfo, String productId, LocalDateTime dateTime, String userId);
    List<Order> findAll();
}
