package com.larsan.cateringservicews.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.*;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "order_detail")
public class OrderDetailEntity {
    @Id
    @GeneratedValue
    @Column(columnDefinition="uniqueidentifier")
    private UUID id;

    @Column(columnDefinition="BIT")
    private Boolean softDelete;

    @ManyToOne
    @JoinColumn(name="customer_id", nullable=false)
    private CustomerEntity customer;

    @ManyToOne
    @JoinColumn(name="pickup_address_id", nullable=false)
    private PickupAddressEntity pickupAddress;

    @Column
    private Integer totalPrice;

    @Column
    private Date orderDate;

    @Column
    private Integer orderStatus;

    @Column
    private Date pickupDate;

    @Column
    private String notes;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "order_detail_id")
    private List<FoodOrderEntity> foodOrderQuantities = new ArrayList<>();

}
