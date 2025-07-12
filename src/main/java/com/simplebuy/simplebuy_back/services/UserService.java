package com.simplebuy.simplebuy_back.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplebuy.simplebuy_back.domain.cart.Cart;
import com.simplebuy.simplebuy_back.domain.user.User;
import com.simplebuy.simplebuy_back.dtos.UserDTO;
import com.simplebuy.simplebuy_back.repositories.UserRepository;

import jakarta.transaction.Transactional;

@Service
public class UserService {
    @Autowired
    UserRepository repository;

    @Autowired
    CartService cartService;
    
    @Transactional
    public User createUser(UserDTO user){
        User newUser = new User();
        newUser.setUsername(user.name());
        newUser.setEmail(user.email());

        Cart newCart = cartService.createCart(new Cart());
        newUser.setCart(newCart);

        return repository.save(newUser);
    }

}
