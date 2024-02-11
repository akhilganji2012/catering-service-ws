package com.larsan.cateringservicews.model;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PickupAddress {
    private UUID id;
    private String address;
    private String addressUrl;
    private String notes;
}
