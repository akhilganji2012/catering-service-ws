package com.larsan.cateringservicews.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Builder;

import java.io.Serializable;

@Embeddable
@Builder
public class FoodOrderKey implements Serializable {
    @Column()
    private String foodId;

    @Column
    private String orderDetailId;
}
