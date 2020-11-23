package com.study.thymeleaf.domain;

import java.math.BigDecimal;

import javax.jdo.annotations.Column;
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
public class OrderLine {
    
    @Id @GeneratedValue
    @Column(name = "ORDER_LINE_ID")
    private Long id;
    
    @Setter
    private Integer amount;
    
    @Setter
    private BigDecimal purchasePrice;

    public OrderLine(Integer amount, BigDecimal purchasePrice) {
        this.amount = amount;
        this.purchasePrice = purchasePrice;
    }
}
