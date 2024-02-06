package com.larsan.cateringservicews.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.GeneratedValue;
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
    @Column(columnDefinition="uniqueidentifier")
    private UUID foodItemId;

    @Column(columnDefinition="uniqueidentifier")
    private UUID orderDetailId;
}
