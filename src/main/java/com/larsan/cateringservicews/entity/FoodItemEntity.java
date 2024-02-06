package com.larsan.cateringservicews.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;
import java.util.UUID;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "food_item")
public class FoodItemEntity {
    @Id
    @GeneratedValue
    @Column(columnDefinition="uniqueidentifier")
    private UUID id;

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

    @OneToMany(mappedBy="foodItem")
    private Set<FoodOrderEntity> foodOrderedList;
}
