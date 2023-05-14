package com.project.ProductService.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long product_ID;

    @Column(name = "PRODUCT_NAME")
    private String productName;
    @Column(name = "PRICE")
    private long price;
    @Column(name = "QUANTITY")
    private long quantity;
}
