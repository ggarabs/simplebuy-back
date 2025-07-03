package com.simplebuy.simplebuy_back.domain.product;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.simplebuy.simplebuy_back.domain.cart.Cart;
import com.simplebuy.simplebuy_back.domain.order.Order;
import com.simplebuy.simplebuy_back.domain.user.User;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "product")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Integer price;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private Long stock_quantity;

    @ManyToOne
    @JoinColumn(name = "seller_id", nullable = false)
    private User seller;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @ManyToMany(mappedBy = "orderProducts", fetch = FetchType.LAZY)
    private Set<Order> orders = new HashSet<Order>();

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @ManyToMany(mappedBy = "cartProducts", fetch = FetchType.LAZY)
    private Set<Cart> carts = new HashSet<Cart>();

    @Column(name = "created_at", nullable = false)
    private LocalDateTime creationTime;
}
