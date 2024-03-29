package org.eCommerce.utils;

import org.eCommerce.data.model.Address;
import org.eCommerce.data.model.User;

public class Mapper {
    public static User map(String name, String password, String phoneNumber, String email, Address homeAddress, String userId){
        User user = new User();
        user.setName(name);
        user.setPassword(password);
        user.setPhoneNumber(phoneNumber);
        user.setEmail(email);
        user.setHomeAddress(homeAddress);
        user.setUserId(userId);
        return user;
    }
}
