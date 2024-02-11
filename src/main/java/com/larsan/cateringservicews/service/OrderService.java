package com.larsan.cateringservicews.service;

import com.larsan.cateringservicews.entity.*;
import com.larsan.cateringservicews.repository.*;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import java.util.Arrays;
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
        FoodItemEntity foodItem = foodItemRepository.save(FoodItemEntity.builder()
                .price(11)
                .name("Akhil Biryani")
                .imageSrcUrl("https://larsanstorage.blob.core.windows.net/slides/catering-1.jpg")
                .description("Made with organic fresh chicken")
                .build());
        FoodItemEntity foodItem1 = foodItemRepository.save(FoodItemEntity.builder()
                .price(11)
                .name("Nagesh Biryani")
                .imageSrcUrl("https://larsanstorage.blob.core.windows.net/slides/catering-1.jpg")
                .description("Made with organic fresh chicken")
                .build());
        FoodItemEntity foodItem2 = foodItemRepository.save(FoodItemEntity.builder()
                .price(11)
                .name("Kavitha Biryani")
                .imageSrcUrl("https://larsanstorage.blob.core.windows.net/slides/catering-1.jpg")
                .description("Made with organic fresh chicken")
                .build());

        OrderDetailEntity resultOrderDetail = orderDetailRepository.save(OrderDetailEntity.builder()
                        .orderStatus(0)
                        .orderDate(new Date())
                        .customer(customer)
                        .notes("Requires Best Quality Food")
                        .pickupAddress(pickupAddress)
                        .totalPrice(12)
                        .pickupDate(new Date())
                        .foodOrderQuantities(Arrays.asList(
                                FoodOrderEntity.builder()
                                    .id(FoodOrderKey.builder()
                                            .foodItem(foodItem)
                                            .build())
                                    .quantity(10)
                                    .build(),
                                FoodOrderEntity.builder()
                                        .id(FoodOrderKey.builder()
                                                .foodItem(foodItem1)
                                                .build())
                                        .quantity(11)
                                        .build(),
                                FoodOrderEntity.builder()
                                        .id(FoodOrderKey.builder()
                                                .foodItem(foodItem2)
                                                .build())
                                        .quantity(12)
                                        .build()
                                ))
                .build());

    return HttpStatus.OK;
    }

    public OrderDetailEntity findOrderInfo(UUID orderNo){
        return orderDetailRepository.findById(orderNo).orElse(new OrderDetailEntity());
    }
}
