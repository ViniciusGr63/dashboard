package com.example.ptf.services;

import com.example.ptf.repositories.ProductRepository; 
import com.example.ptf.models.Product;
import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
}
