package com.larsan.cateringservicews.entity;

import jakarta.persistence.*;
import lombok.Builder;

@Entity
@Builder
@Table(name = "food_item")
public class FoodItemEntity {
    @Id
    @Column(columnDefinition="uniqueidentifier")
    private String id;

    @Column(columnDefinition="BIT")
    private Boolean soft_delete;

    @Column
    private String name;

    @Column
    private String imageSrcUrl;

    @Column
    private Integer price;

    @Column
    private String description;

}
