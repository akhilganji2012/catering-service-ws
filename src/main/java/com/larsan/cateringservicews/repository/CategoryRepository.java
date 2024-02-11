package com.larsan.cateringservicews.repository;

import com.larsan.cateringservicews.entity.CategoryEntity;
import com.larsan.cateringservicews.entity.SlideEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface CategoryRepository extends JpaRepository<CategoryEntity, UUID> {
    List<CategoryEntity> findBySoftDelete(boolean b);
}
