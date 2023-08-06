package com.example.portfolio.product.domain.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@AllArgsConstructor
@Data
public class ProductsDto {
    List<ProductDto> data;
}
