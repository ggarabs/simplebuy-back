package com.simplebuy.simplebuy_back.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simplebuy.simplebuy_back.domain.cart.Cart;

@Repository
public interface CartRepository extends JpaRepository<Cart, UUID>{}
