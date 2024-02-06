package com.larsan.cateringservicews.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "pickup_address")
public class PickupAddressEntity {

    @Id
    @GeneratedValue
    @Column(columnDefinition="uniqueidentifier")
    private UUID id;

    @Column
    private String address;

    @Column
    private String addressUrl;

    @Column
    private String notes;

    @Column(columnDefinition="BIT default 0")
    private Boolean soft_delete;
}
