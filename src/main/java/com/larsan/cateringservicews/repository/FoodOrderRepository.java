package com.larsan.cateringservicews.repository;

import com.larsan.cateringservicews.entity.FoodOrderEntity;
import com.larsan.cateringservicews.entity.FoodOrderKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodOrderRepository extends JpaRepository<FoodOrderEntity, FoodOrderKey> {
}
