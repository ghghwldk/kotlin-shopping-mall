package com.example.portfolio.product.service.impl;

import com.example.portfolio.product.domain.dto.request.ProductsParam;
import com.example.portfolio.product.domain.dto.response.ProductDto;
import com.example.portfolio.product.domain.dto.response.ProductsDto;
import com.example.portfolio.product.domain.dto.response.SavedIdsResponse;
import com.example.portfolio.product.domain.entity.ProductEntity;
import com.example.portfolio.product.mapper.ProductMapper;
import com.example.portfolio.product.repository.ProductRepository;
import com.example.portfolio.product.service.ProductService;
import com.example.portfolio.test.initializer.DataInitailizer;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final Logger logger = LoggerFactory.getLogger(ProductServiceImpl.class);
    private final ProductRepository productRepository;
    private final ProductMapper productMapper;
    @Override
    @Transactional
    public SavedIdsResponse saveAll(ProductsParam productsParam) {
        List<ProductEntity> saved = productRepository.saveAll(productsParam.getData()
                .stream()
                .map(productMapper::toEntity)
                .collect(Collectors.toList()));
        
        logger.info("data is successfully saved");
        return get(saved);
    }

    public SavedIdsResponse get(List<ProductEntity> saved){
        List<Long> ids = saved.stream()
                .map(ProductEntity::getId)
                .collect(Collectors.toList());

        return SavedIdsResponse.builder()
                .ids(ids)
                .build();
    }

    @Override
    public ProductsDto findAll() {
        List<ProductDto> data = productRepository.findAll()
                .stream()
                .map(productMapper::toDto)
                .collect(Collectors.toList());

        return ProductsDto.builder()
                .data(data)
                .build();
    }

}
