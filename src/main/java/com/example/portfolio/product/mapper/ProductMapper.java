package com.example.portfolio.product.mapper;

import com.example.portfolio.product.domain.dto.request.ProductParam;
import com.example.portfolio.product.domain.dto.response.ProductDto;
import com.example.portfolio.product.domain.entity.ProductEntity;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(
        componentModel = "spring",
        injectionStrategy = InjectionStrategy.CONSTRUCTOR,
        unmappedTargetPolicy = ReportingPolicy.ERROR
)
public interface ProductMapper {
    @Mapping(target= "id", ignore = true)
    public ProductEntity toEntity(ProductParam productParam);

    public ProductDto toDto(ProductEntity productEntity);
}
