package com.larsan.cateringservicews.repository;

import com.larsan.cateringservicews.entity.PickupAddressEntity;
import com.larsan.cateringservicews.entity.SlideEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface PickupAddressRepository extends JpaRepository<PickupAddressEntity, UUID> {
    List<PickupAddressEntity> findBySoftDelete(boolean b);

}
