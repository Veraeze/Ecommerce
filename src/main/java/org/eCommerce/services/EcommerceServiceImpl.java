package org.eCommerce.services;

import org.eCommerce.data.model.User;
import org.eCommerce.data.model.Wallet;
import org.eCommerce.data.repository.UserRepository;
import org.eCommerce.dtos.request.RegisterRequest;
import org.eCommerce.exceptions.UsernameUnavailable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static org.eCommerce.utils.Mapper.map;

@Service
public class EcommerceServiceImpl implements EcommerceService{

    @Autowired
    UserRepository userRepository;
    @Override
    public User register(RegisterRequest registerRequest) {
        if (validateUsername(registerRequest.getName())) throw new UsernameUnavailable(registerRequest.getName() + " already exists!");

        User user = map(registerRequest.getName(), registerRequest.getPassword(),registerRequest.getPhoneNumber(),
                registerRequest.getEmail(), registerRequest.getHomeAddress(), "UES" + (userRepository.count()+1));

        Wallet wallet = new Wallet();
        user.setWallet(wallet);

        userRepository.save(user);
        return user;
    }

    public boolean validateUsername(String userName){
        User user = userRepository.findUserBy(userName);
        return user != null;
    }
}
