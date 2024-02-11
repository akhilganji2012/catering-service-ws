package com.larsan.cateringservicews.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FoodOrderQuantity {
    private FoodItem foodItem;
    private Integer quantity;
}
