package org.eCommerce.data.repository;

import org.eCommerce.data.model.ShoppingCart;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CartRepository extends MongoRepository<ShoppingCart, String> {
    ShoppingCart findShoppingCartByCartId(String Id);
}
