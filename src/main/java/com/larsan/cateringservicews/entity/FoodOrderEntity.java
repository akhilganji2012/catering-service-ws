package com.larsan.cateringservicews.entity;

import jakarta.persistence.*;
import lombok.Builder;

@Entity
@Builder
@Table(name = "food_order")
public class FoodOrderEntity {

    @EmbeddedId
    private FoodOrderKey id;

    @ManyToOne
    @MapsId("foodId")
    @JoinColumn(name = "food_id")
    private FoodItemEntity foodItem;

    @ManyToOne
    @MapsId("orderDetailId")
    @JoinColumn(name = "order_detail_id")
    private OrderDetailEntity orderDetail;

    @Column
    private Integer quantity;
}
