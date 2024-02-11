package com.larsan.cateringservicews.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FoodItem {
    private UUID id;
    private String name;
    private String imageSrcUrl;
    private Integer price;
    private String description;
}
