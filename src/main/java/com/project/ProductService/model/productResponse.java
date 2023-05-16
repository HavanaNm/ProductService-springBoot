package com.project.ProductService.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class productResponse {

    private String productName;
    private long price;
    private long quantity;
    private long product_ID;
}
