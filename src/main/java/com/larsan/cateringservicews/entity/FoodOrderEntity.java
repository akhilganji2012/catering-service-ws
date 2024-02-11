package com.larsan.cateringservicews.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "food_order")
public class FoodOrderEntity {

    @EmbeddedId
    private FoodOrderKey id;

    @Column
    private Integer quantity;
}
