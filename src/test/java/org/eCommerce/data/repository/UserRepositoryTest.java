package org.eCommerce.data.repository;

import org.eCommerce.data.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserRepositoryTest {

    @Autowired
    UserRepository userRepository;

    @Test
    void countIsOneWhenYouSaveOne(){
        User user = new User();
        userRepository.save(user);
        assertEquals(1, userRepository.count());
    }
}