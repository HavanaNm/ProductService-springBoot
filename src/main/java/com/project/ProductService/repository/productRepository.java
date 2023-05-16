package com.project.ProductService.repository;

import com.project.ProductService.entity.product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface productRepository extends JpaRepository<product,Long> {
}
