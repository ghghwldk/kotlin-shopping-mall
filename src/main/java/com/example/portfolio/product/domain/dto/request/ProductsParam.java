package com.example.portfolio.product.domain.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.LinkedList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductsParam {
    List<ProductParam> data; //= new LinkedList<>();

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    private static class ProductParam{
        public String name;
    }
}

