package com.larsan.cateringservicews.entity;

import com.larsan.cateringservicews.model.FoodItem;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.UUID;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "category")
@Data
public class CategoryEntity {
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

    @OneToMany(
//            mappedBy="category",
            cascade = CascadeType.ALL,
            orphanRemoval = true)
    @JoinColumn(name="category_id", nullable=false)
    private List<FoodItemEntity> foodItems = new ArrayList<>();

}
