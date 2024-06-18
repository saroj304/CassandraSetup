package com.cassandra_test.practise.controller;

import com.cassandra_test.practise.ProductRepository;
import com.cassandra_test.practise.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller("/api")
public class ProductController {
    @Autowired
    private ProductRepository productRepository;
    @PostMapping("/products")
    public Product addProduct(@RequestBody Product product){
        productRepository.save(product);
        return product;
    }
}
