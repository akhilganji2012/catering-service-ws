package com.larsan.cateringservicews.service;

import com.larsan.cateringservicews.configuration.ModelMapConfig;
import com.larsan.cateringservicews.model.Category;
import com.larsan.cateringservicews.repository.CategoryRepository;
import com.larsan.cateringservicews.repository.FoodItemRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MenuService {

    private final CategoryRepository categoryRepository;

    private final FoodItemRepository foodItemRepository;
    private final ModelMapConfig mapConfig;

    public MenuService(CategoryRepository categoryRepository, FoodItemRepository foodItemRepository, ModelMapConfig mapConfig) {
        this.categoryRepository = categoryRepository;
        this.foodItemRepository = foodItemRepository;
        this.mapConfig = mapConfig;
    }
    @Transactional
    public List<Category> fetchCategories(){
        return this.categoryRepository.findBySoftDelete(false).stream().map(categoryEntity -> mapConfig.getModelMapper().map(categoryEntity,Category.class)).collect(Collectors.toList());
    }
}
