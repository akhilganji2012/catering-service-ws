package com.larsan.cateringservicews.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;

@Entity
@Builder
@Table(name = "pickup_address")
public class PickupAddressEntity {

    @Id
    @Column(columnDefinition="uniqueidentifier")
    private String id;

    @Column
    private String address;

    @Column
    private String addressUrl;

    @Column
    private String notes;

    @Column(columnDefinition="BIT")
    private Boolean soft_delete;
}
