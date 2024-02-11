package com.larsan.cateringservicews.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.JdbcTypeCode;

import java.io.Serializable;
import java.sql.Types;
import java.util.UUID;

@Embeddable
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class FoodOrderKey implements Serializable {
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "food_item_id")
    private FoodItemEntity foodItem;

//    @ManyToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "order_detail_id")
//    private OrderDetailEntity orderDetail;
}
