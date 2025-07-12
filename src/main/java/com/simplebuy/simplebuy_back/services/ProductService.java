package com.simplebuy.simplebuy_back.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplebuy.simplebuy_back.domain.product.Product;
import com.simplebuy.simplebuy_back.dtos.ProductDTO;
import com.simplebuy.simplebuy_back.repositories.ProductRepository;

@Service
public class ProductService {

    @Autowired
    ProductRepository repository;

    public List<Product> getAllProducts(){
        return repository.findAll();
    }

    public Product createProduct(ProductDTO product){
        Product newProduct = new Product();
        newProduct.setName(product.name());
        newProduct.setDescription(product.description());
        newProduct.setPrice(product.price());
        newProduct.setStock_quantity(product.stock_quantity());

        return repository.save(newProduct);
    }
    
}