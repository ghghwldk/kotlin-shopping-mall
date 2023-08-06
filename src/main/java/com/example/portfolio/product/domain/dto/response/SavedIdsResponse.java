package com.example.portfolio.product.domain.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Setter;

import java.util.List;


@Builder
@AllArgsConstructor
@Data
public class SavedIdsResponse {
    public List<Long> ids;

}