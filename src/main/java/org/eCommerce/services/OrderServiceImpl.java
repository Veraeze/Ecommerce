package org.eCommerce.services;

import org.eCommerce.data.model.Customer;
import org.eCommerce.data.model.Order;
import org.eCommerce.data.repository.OrderRepository;
import org.eCommerce.data.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService{
    @Autowired
    OrderRepository orderRepository;
    @Autowired
    UserRepository userRepository;

    @Override
    public Order order(String orderId, Customer customerInfo, String productId, LocalDateTime dateTime, String userId) {
        Order order = new Order();

        order.setOrderId(orderId);
        order.setCustomerInfo(customerInfo);
        order.setUserId(userId);
        order.setProductId(productId);
        order.setDateTime(dateTime);
        order.setOrdered(true);

        orderRepository.save(order);
        return order;
    }

    @Override
    public List<Order> findAll() {
        return null;
    }
}
