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

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @MapsId("foodItemId")
    @JoinColumn(name = "food_item_id")
    private FoodItemEntity foodItem;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @MapsId("orderDetailId")
    @JoinColumn(name = "order_detail_id")
    private OrderDetailEntity orderDetail;

    @Column
    private Integer quantity;
}
