package org.eCommerce.data.repository;

import org.eCommerce.data.model.ShoppingCart;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CartRepositoryTest {
    @Autowired
    CartRepository cartRepository;

    @Test
    void countIsOneWhenYouSaveOne(){
        ShoppingCart cart = new ShoppingCart();
        cartRepository.save(cart);
        assertEquals(1, cartRepository.count());
    }
}