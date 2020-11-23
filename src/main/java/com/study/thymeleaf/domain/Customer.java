package com.study.thymeleaf.domain;

import javax.jdo.annotations.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.study.thymeleaf.domain.base.BaseTimeEntity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@RequiredArgsConstructor
public class Customer extends BaseTimeEntity {
    
    @Id @GeneratedValue
    @Column(name = "CUSTOMER_ID")
    private Long id;
    
    @Setter 
    @NonNull
    private String name;
    
    
}
