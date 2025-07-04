package com.simplebuy.simplebuy_back.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simplebuy.simplebuy_back.domain.order.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, UUID>{}
