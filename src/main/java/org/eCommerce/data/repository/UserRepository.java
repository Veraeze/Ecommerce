package org.eCommerce.data.repository;

import org.eCommerce.data.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
    User findUserBy(String name);

}
