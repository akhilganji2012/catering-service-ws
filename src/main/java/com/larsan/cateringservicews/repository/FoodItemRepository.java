package com.larsan.cateringservicews.repository;

import com.larsan.cateringservicews.entity.FoodItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface FoodItemRepository extends JpaRepository<FoodItemEntity, UUID> {
}
