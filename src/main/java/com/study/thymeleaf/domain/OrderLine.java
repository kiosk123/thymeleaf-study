package com.study.thymeleaf.domain;

import java.math.BigDecimal;

import javax.jdo.annotations.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class OrderLine {
    
    @Id @GeneratedValue
    @Column(name = "ORDER_LINE_ID")
    private Long id;
    
    @Setter
    private Integer amount;
    
    @Setter
    private BigDecimal purchasePrice;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ORDER_ID")
    private Order order;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PRODUCT_ID")
    private Product product;

    public OrderLine(Integer amount, BigDecimal purchasePrice, Order order, Product product) {
        this.amount = amount;
        this.purchasePrice = purchasePrice;
        this.order = order;
        this.product = product;
    }
}
