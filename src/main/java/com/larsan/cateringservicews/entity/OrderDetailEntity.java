package com.larsan.cateringservicews.entity;

import jakarta.persistence.*;
import lombok.Builder;

import java.sql.Date;
import java.util.List;
import java.util.Set;

@Entity
@Builder
@Table(name = "order_detail")
public class OrderDetailEntity {
    @Id
    @Column(columnDefinition="uniqueidentifier")
    private String id;

    @Column(columnDefinition="BIT")
    private Boolean soft_delete;

    @ManyToOne
    @JoinColumn(name="customer_id", nullable=false)
    private CustomerEntity customer;

    @Column
    private String pickupAddressId;

    @Column
    private Integer totalPrice;

    @Column
    private Integer totalQuantity;

    @Column
    private Date orderDate;

    @Column
    private Integer orderStatus;

    @Column
    private Date pickupDate;

    @Column
    private String notes;

    @OneToMany
    private Set<FoodOrderEntity> foodOrderQuantities;

}
