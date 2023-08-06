package com.example.portfolio.product.controller;

import com.example.portfolio.product.domain.dto.request.ProductsParam;
import com.example.portfolio.product.domain.dto.response.SavedIdsResponse;
import com.example.portfolio.product.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ProductController {
    private final Logger logger = LoggerFactory.getLogger(ProductController.class);

    private final ProductService productService;

    private static final class Urls{
        private static final String prefix = "/products";
    }

    @PostMapping(Urls.prefix)
    private ResponseEntity<SavedIdsResponse> save(@RequestBody ProductsParam productsParam){

        return null;
    }
}
