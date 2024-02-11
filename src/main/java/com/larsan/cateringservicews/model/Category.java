package com.larsan.cateringservicews.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Category {

    private UUID id;

    private String name;

    private String imageSrcUrl;

    private List<FoodItem> foodItems;
}
