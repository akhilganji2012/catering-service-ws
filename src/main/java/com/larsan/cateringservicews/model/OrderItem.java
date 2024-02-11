package com.larsan.cateringservicews.model;

import com.larsan.cateringservicews.entity.CustomerEntity;
import com.larsan.cateringservicews.entity.FoodOrderEntity;
import com.larsan.cateringservicews.entity.PickupAddressEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrderItem {
    private UUID id;

    private Customer customer;

    private PickupAddress pickupAddress;

    private Integer totalPrice;

    private Date orderDate;

    private Integer orderStatus;

    private Date pickupDate;

    private String notes;

    private List<FoodOrderQuantity> foodOrderQuantities;

}
