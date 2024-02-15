package com.larsan.cateringservicews.controller;

import com.larsan.cateringservicews.entity.OrderDetailEntity;
import com.larsan.cateringservicews.service.OrderService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

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

    @GetMapping("/find")
    public OrderDetailEntity fetchOrderDetails(@RequestParam String orderId){
        return this.orderService.findOrderInfo(UUID.fromString(orderId));
    }
}
