package org.eCommerce.data.repository;

import org.eCommerce.data.model.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class OrderRepositoryTest {
    @Autowired
    OrderRepository orderRepository;

    @Test
    void countIsOneWhenYouSaveOne(){
        Order book = new Order();
        orderRepository.save(book);
        assertEquals(1, orderRepository.count());
    }
}