package com.project.ProductService.controller;

import com.project.ProductService.entity.product;
import com.project.ProductService.model.productRequest;
import com.project.ProductService.model.productResponse;
import com.project.ProductService.service.productService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class productController {

    @Autowired
    private productService ProductService;

    private product Product;

    @PostMapping
    public ResponseEntity<Long> addProduct(@RequestBody productRequest ProductRequest) {
        long productID = ProductService.addProdcut(ProductRequest);
        return new ResponseEntity<>(productID, HttpStatus.CREATED);
    }
    @GetMapping("/{id}")
    public ResponseEntity<productResponse> getProduct(@PathVariable("id") long productID){
        productResponse ProductResponse =  ProductService.getProduct(productID);
        return new ResponseEntity<>(ProductResponse, HttpStatus.OK);
    }

@PutMapping("/reduceQuantity/{id}")
    public ResponseEntity<Void> reduceQuantity(@PathVariable("id") Long productId, @RequestParam Long quantity){
    ProductService.reduceQuantity(productId,quantity);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}

