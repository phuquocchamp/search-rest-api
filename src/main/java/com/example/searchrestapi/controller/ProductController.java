package com.example.searchrestapi.controller;

import com.example.searchrestapi.entity.Product;
import com.example.searchrestapi.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/product")
public class ProductController {
    private ProductService productService;

    public ProductController(ProductService productService){
        this.productService = productService;
    }
    @GetMapping("search")
    public ResponseEntity<List<Product>> searchProducts(@RequestParam("query") String query){
        return new ResponseEntity<>(productService.searchProducts(query), HttpStatus.OK);
    }
    @PostMapping("create")
    public ResponseEntity<Product> createProduct(@RequestBody Product product){
        return new ResponseEntity<>(productService.createProduct(product), HttpStatus.CREATED);
    }
}
