package com.study.thymeleaf.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.study.thymeleaf.domain.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
    
}
