package com.study.thymeleaf.domain;

import javax.jdo.annotations.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

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
public class Comment  extends BaseTimeEntity {
    
    @Id @GeneratedValue
    @Column(name = "COMMENT_ID")
    private Long id;
    
    @Lob
    @NonNull
    @Setter
    private String text;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PRODUCT_ID")
    @NonNull
    @Setter
    private Product product;
    
}
