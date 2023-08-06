package com.example.portfolio.product.service;

import com.example.portfolio.product.domain.dto.request.ProductsParam;
import com.example.portfolio.product.domain.dto.response.ProductsDto;
import com.example.portfolio.product.domain.dto.response.SavedIdsResponse;
import org.springframework.stereotype.Service;

public interface ProductService {
    public SavedIdsResponse saveAll(ProductsParam productsParam);
    public ProductsDto findAll();
}
