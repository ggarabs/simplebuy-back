package com.simplebuy.simplebuy_back.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplebuy.simplebuy_back.domain.cart.Cart;
import com.simplebuy.simplebuy_back.repositories.CartRepository;

@Service
public class CartService {
    @Autowired
    private CartRepository repository;

    public Cart createCart(Cart newCart){
        return repository.save(newCart);
    }
}
