package com.project.ProductService.model;

import lombok.Data;

@Data
public class productRequest {
    private String name;
    private long price;
    private long quantity;

}
