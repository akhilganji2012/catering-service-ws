package com.larsan.cateringservicews.controller;

import com.larsan.cateringservicews.model.Category;
import com.larsan.cateringservicews.service.MenuService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/menu")
public class MenuController {
    private final MenuService menuService;

    public MenuController(MenuService menuService) {
        this.menuService = menuService;
    }

    @GetMapping("/all")
    public List<Category> fetchFullMenu(){
        return menuService.fetchCategories();
    }
}
