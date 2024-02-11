package com.larsan.cateringservicews.controller;

import com.larsan.cateringservicews.model.PickupAddress;
import com.larsan.cateringservicews.service.PickUpService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/address")
public class PickUpController {
    private final PickUpService pickUpService;

    public PickUpController(PickUpService pickUpService) {
        this.pickUpService = pickUpService;
    }

    @GetMapping("/all")
    public List<PickupAddress> fetchAddresses(){
        return pickUpService.fetchAddresses();
    }
}
