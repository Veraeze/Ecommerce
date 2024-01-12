package org.eCommerce.services;

import org.eCommerce.data.model.Address;
import org.eCommerce.data.repository.CartRepository;
import org.eCommerce.data.repository.OrderRepository;
import org.eCommerce.data.repository.ReviewRepository;
import org.eCommerce.data.repository.UserRepository;
import org.eCommerce.dtos.request.RegisterRequest;
import org.eCommerce.exceptions.UsernameUnavailable;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
class EcommerceServiceTest {
    @Autowired
    EcommerceService eShop;
    @Autowired
    UserRepository userRepository;
    @Autowired
    OrderRepository orderRepository;
    @Autowired
    CartRepository cartRepository;
    @Autowired
    ReviewRepository reviewRepository;

    @AfterEach
    public void delete() {
        userRepository.deleteAll();
        orderRepository.deleteAll();
        reviewRepository.deleteAll();
        cartRepository.deleteAll();
    }

    @Test
    void testThatAUserCanRegister(){

        RegisterRequest registerRequest = request("vera", "08093280641", "veraeze@gmail.com", "password", address("alaka", "lekki", "lagos", "Nigeria", "12001"));
        eShop.register(registerRequest);
        assertEquals(1, userRepository.count());

    }

    @Test
    void testThatExceptionIsThrownWhenUserRegistersWithAnAlreadyRegisteredName() {

        RegisterRequest registerRequest = request("vera", "08093280641", "veraeze@gmail.com", "password", address("alaka", "lekki", "lagos", "Nigeria", "12001"));
        eShop.register(registerRequest);
        assertThrows(UsernameUnavailable.class, ()-> eShop.register(registerRequest));

    }

    private static Address address(String street, String city, String state, String country, String zipCode){
        Address homeAddress = new Address();
        homeAddress.setStreet(street);
        homeAddress.setCity(city);
        homeAddress.setState(state);
        homeAddress.setCountry(country);
        homeAddress.setZipCode(zipCode);
        return homeAddress;
    }

    private static RegisterRequest request(String name, String phoneNumber, String email, String password, Address homeAddress){
        RegisterRequest registerRequest = new RegisterRequest();
        registerRequest.setName(name);
        registerRequest.setPhoneNumber(phoneNumber);
        registerRequest.setEmail(email);
        registerRequest.setPassword(password);
        registerRequest.setHomeAddress(homeAddress);
        return registerRequest;
    }
}