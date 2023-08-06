package com.example.portfolio.product.controller;

import com.example.portfolio.product.domain.dto.request.ProductParam;
import com.example.portfolio.product.domain.dto.request.ProductsParam;
import com.example.portfolio.product.domain.dto.response.ProductsDto;
import com.example.portfolio.product.domain.dto.response.SavedIdsResponse;
import com.example.portfolio.product.domain.entity.ProductEntity;
import com.example.portfolio.product.mapper.ProductMapper;
import com.example.portfolio.product.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.portfolio.product.domain.dto.response.SavedIdsResponse;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
public class ProductController {
    private final Logger logger = LoggerFactory.getLogger(ProductController.class);

    private final ProductService productService;
    private final ProductMapper productMapper;

    private static final class Urls{
        private static final String prefix = "/products";
    }

    @PostMapping(Urls.prefix)
    private ResponseEntity<SavedIdsResponse> save(@RequestBody ProductsParam productsParam){
        return new ResponseEntity<SavedIdsResponse>(productService.saveAll(productsParam), HttpStatus.CREATED);
    }

    @GetMapping(Urls.prefix)
    private ResponseEntity<ProductsDto> get(){
        return null;
    }
}
