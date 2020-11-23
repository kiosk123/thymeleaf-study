package com.study.thymeleaf.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.study.thymeleaf.domain.base.BaseTimeEntity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Product  extends BaseTimeEntity {
    
    @Id @GeneratedValue
    @Column(name = "PRODUCT_ID")
    private Long id;
    
    @Setter
    private String name;
    @Setter
    private BigDecimal price;
    @Setter
    private boolean inStock;
    
    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
    private List<Comment> comments = new ArrayList<>();
    
    public Product(String name, BigDecimal price, boolean inStock) {
        this.name = name;
        this.price = price;
        this.inStock = inStock;
    }
}
