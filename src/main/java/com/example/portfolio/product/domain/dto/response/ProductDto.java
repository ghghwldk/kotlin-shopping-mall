package com.example.portfolio.product.domain.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;

@Builder
@AllArgsConstructor
@Data
public class ProductDto {
    private Long id;
    private String name;
}
