package com.project.ProductService.service;

import com.project.ProductService.model.productRequest;
import com.project.ProductService.model.productResponse;

public interface productService {

    long addProdcut(productRequest productRequest);

    productResponse getProduct(Long productID);
}

