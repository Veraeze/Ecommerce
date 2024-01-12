package org.eCommerce.data.repository;

import org.eCommerce.data.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
    Product findProductByProductId(String Id);

}
