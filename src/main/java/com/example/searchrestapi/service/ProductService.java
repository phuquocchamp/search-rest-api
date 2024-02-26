package com.example.searchrestapi.service;

import com.example.searchrestapi.entity.Product;
import com.example.searchrestapi.repository.ProductRepository;

import java.util.List;

public interface ProductService {
    List<Product> searchProducts(String query);
    Product createProduct(Product product);
}
