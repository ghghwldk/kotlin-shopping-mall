package com.example.portfolio.product.mapper;

import com.example.portfolio.product.domain.dto.request.ProductParam;
import com.example.portfolio.product.domain.dto.response.ProductDto;
import com.example.portfolio.product.domain.dto.response.ProductDto.ProductDtoBuilder;
import com.example.portfolio.product.domain.entity.ProductEntity;
import com.example.portfolio.product.domain.entity.ProductEntity.ProductEntityBuilder;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-08-06T20:47:12+0900",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 11.0.2 (Oracle Corporation)"
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

    @Override
    public ProductDto toDto(ProductEntity productEntity) {
        if ( productEntity == null ) {
            return null;
        }

        ProductDtoBuilder productDto = ProductDto.builder();

        productDto.id( productEntity.getId() );
        productDto.name( productEntity.getName() );
        productDto.createdDate( productEntity.getCreatedDate() );
        productDto.modifiedDate( productEntity.getModifiedDate() );
        productDto.createdBy( productEntity.getCreatedBy() );
        productDto.updatedBy( productEntity.getUpdatedBy() );

        return productDto.build();
    }
}
