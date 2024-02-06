package com.larsan.cateringservicews.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.UUID;

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
    private Boolean soft_delete;

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

    @OneToMany(mappedBy="orderDetail")
    private Set<FoodOrderEntity> foodOrderQuantities;

}
