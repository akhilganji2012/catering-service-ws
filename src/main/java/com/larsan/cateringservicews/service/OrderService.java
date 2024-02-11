package com.larsan.cateringservicews.service;

import com.larsan.cateringservicews.entity.*;
import com.larsan.cateringservicews.repository.*;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.Optional;
import java.util.UUID;

@Component
public class OrderService {
    private final OrderDetailRepository orderDetailRepository;
    private final PickupAddressRepository pickupAddressRepository;

    private final CustomerRepository customerRepository;
    private final FoodOrderRepository foodOrderRepository;

    private final FoodItemRepository foodItemRepository;

    public OrderService(OrderDetailRepository orderDetailRepository, PickupAddressRepository pickupAddressRepository, CustomerRepository customerRepository, FoodOrderRepository foodOrderRepository, FoodItemRepository foodItemRepository) {
        this.orderDetailRepository = orderDetailRepository;
        this.pickupAddressRepository = pickupAddressRepository;
        this.customerRepository = customerRepository;
        this.foodOrderRepository = foodOrderRepository;
        this.foodItemRepository = foodItemRepository;
    }

    public HttpStatus addOrderInfo(OrderDetailEntity orderDetail){

        PickupAddressEntity pickupAddress = pickupAddressRepository.findById(UUID.fromString("64a088ae-d7b2-45fc-9b14-13419374ee0d")).orElse(null);
        CustomerEntity customer = customerRepository.save(CustomerEntity.builder()
                .firstName("Akhil")
                .email("akhilganji2012@gmail.com")
                .lastName("Ganji")
                .phone("8052982812")
                .build());

        OrderDetailEntity resultOrderDetail = orderDetailRepository.save(OrderDetailEntity.builder()
                        .orderStatus(0)
                        .orderDate(new Date())
                        .customer(customer)
                        .notes("Requires Best Quality Food")
                        .pickupAddress(pickupAddress)
                        .totalPrice(12)
                        .pickupDate(new Date())
                .build());

        FoodItemEntity foodItem = foodItemRepository.save(FoodItemEntity.builder()
                        .price(11)
                        .name("Fish Biryani")
                        .imageSrcUrl("https://larsanstorage.blob.core.windows.net/slides/catering-1.jpg")
                        .description("Made with organic fresh chicken")
                .build());
        foodOrderRepository.save(FoodOrderEntity.builder()
                        .id(FoodOrderKey.builder()
                                .orderDetailId(resultOrderDetail.getId())
                                .foodItemId(foodItem.getId())
                                .build())
                        .foodItem(foodItem)
                        .orderDetail(resultOrderDetail)
                        .quantity(2)
                .build());
    return HttpStatus.OK;
    }
}
