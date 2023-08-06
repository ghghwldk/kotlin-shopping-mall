package com.example.portfolio.product.mapper;

import com.example.portfolio.product.domain.dto.request.ProductParam;
import com.example.portfolio.product.domain.entity.ProductEntity;
import com.example.portfolio.product.domain.entity.ProductEntity.ProductEntityBuilder;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-08-06T17:45:02+0900",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.2 (Oracle Corporation)"
)
@Component
public class ProductMapperImpl implements ProductMapper {

    @Override
    public ProductEntity toEntity(ProductParam productParam) {
        if ( productParam == null ) {
            return null;
        }

        ProductEntityBuilder productEntity = ProductEntity.builder();

        productEntity.name( productParam.getName() );

        return productEntity.build();
    }
}
