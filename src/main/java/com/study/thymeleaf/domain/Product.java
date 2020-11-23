package com.study.thymeleaf.domain;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Product {
    
    @Id @GeneratedValue
    @Column(name = "PRODUCT_ID")
    private Long id;
    
    @Setter
    private String name;
    @Setter
    private BigDecimal price;
    @Setter
    private boolean inStock;
    
    public Product(String name, BigDecimal price, boolean inStock) {
        this.name = name;
        this.price = price;
        this.inStock = inStock;
    }
}
