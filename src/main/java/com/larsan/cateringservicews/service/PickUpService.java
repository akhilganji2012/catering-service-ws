package com.larsan.cateringservicews.service;

import com.larsan.cateringservicews.configuration.ModelMapConfig;
import com.larsan.cateringservicews.model.PickupAddress;
import com.larsan.cateringservicews.repository.PickupAddressRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PickUpService {
    private final ModelMapConfig mapConfig;
    private final PickupAddressRepository pickupAddressRepository;

    public PickUpService(ModelMapConfig mapConfig, PickupAddressRepository pickupAddressRepository) {
        this.mapConfig = mapConfig;
        this.pickupAddressRepository = pickupAddressRepository;
    }

    public List<PickupAddress> fetchAddresses(){
        return pickupAddressRepository.findBySoftDelete(false).stream().map(address-> mapConfig.getModelMapper().map(address,PickupAddress.class)).collect(Collectors.toList());
    }

}
