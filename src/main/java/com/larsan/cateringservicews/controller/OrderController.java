package com.larsan.cateringservicews.controller;

import com.larsan.cateringservicews.entity.OrderDetailEntity;
import com.larsan.cateringservicews.service.OrderService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {
    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping("/create")
    public HttpStatus createOrder(){
        return this.orderService.addOrderInfo(OrderDetailEntity.builder().build());
    }
}
