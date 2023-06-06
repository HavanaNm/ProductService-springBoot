package com.project.ProductService.model;

import lombok.Data;

@Data
public class productRequest {
    private String productName;
    private long price;
    private long quantity;
}
