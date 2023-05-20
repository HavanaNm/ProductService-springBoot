package com.project.ProductService.service;

import com.project.ProductService.entity.product;
import com.project.ProductService.exception.productServiceCustomException;
import com.project.ProductService.model.productRequest;
import com.project.ProductService.model.productResponse;
import com.project.ProductService.repository.productRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class productServiceImpl implements productService{

    @Autowired
    private productRepository ProductRepository;
    @Override
    public long addProdcut(productRequest productRequest) {
        log.info("Adding Product...");
        product Product = product.builder()
                .productName(productRequest.getName())
                .quantity(productRequest.getQuantity())
                .price(productRequest.getPrice())
                .build();
        log.info("Product added successfully");
        ProductRepository.save(Product);
        return Product.getProduct_ID();
    }

    @Override
    public productResponse getProduct(Long productID) {
        log.info("Get the product for productID" + productID);
        product Product = ProductRepository.findById(productID)
                .orElseThrow(()-> new productServiceCustomException("product with that Id is not found","PRODUCT NOT FOUND"));
        productResponse productResponse = new productResponse();
        BeanUtils.copyProperties(Product,productResponse);
        return productResponse;
    }

    @Override
    public void reduceQuantity(Long productId, Long quantity) {
        log.info("Reduce quantity {} for id: {} ", quantity);
        product Product = ProductRepository.findById(productId)
                .orElseThrow(() -> new productServiceCustomException("Product with given ID not found", "PRODUCT_NOT_FOUND"));

        if (Product.getQuantity() < quantity) {
            throw new productServiceCustomException("Product doesn't have sufficient quantity"," INSUFFICIENT_QUANTITY");
        }
        Product.setQuantity(Product.getQuantity() - quantity);
        ProductRepository.save(Product);
        log.info("Product Quantity updated successfully");
    }
}
