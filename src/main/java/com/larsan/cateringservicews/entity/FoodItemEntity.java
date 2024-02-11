package com.larsan.cateringservicews.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;
import java.util.UUID;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Table(name = "food_item")
public class FoodItemEntity {
    @Id
    @GeneratedValue
    @Column(columnDefinition="uniqueidentifier")
    private UUID id;

    @Column(columnDefinition="BIT")
    private Boolean softDelete;

    @Column
    private String name;

    @Column
    private String imageSrcUrl;

    @Column
    private Integer price;

    @Column
    private String description;

}
