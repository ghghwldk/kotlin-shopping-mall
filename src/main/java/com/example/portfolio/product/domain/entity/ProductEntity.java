package com.example.portfolio.product.domain.entity;

import com.example.portfolio.global.BaseTimeEntity;
import lombok.*;

import javax.persistence.*;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "product")
@Entity
public class ProductEntity extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column
    private Long id;
    @Column
    private String name;

    public void update(String name){
        this.name = name;
    }
}

