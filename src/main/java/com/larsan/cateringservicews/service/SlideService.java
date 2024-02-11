package com.larsan.cateringservicews.service;

import com.larsan.cateringservicews.configuration.ModelMapConfig;
import com.larsan.cateringservicews.entity.SlideEntity;
import com.larsan.cateringservicews.model.Slide;
import com.larsan.cateringservicews.repository.SlideRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SlideService {
    private final ModelMapConfig mapConfig;
    private final SlideRepository slideRepository;

    public SlideService(ModelMapConfig mapConfig, SlideRepository slideRepository) {
        this.mapConfig = mapConfig;
        this.slideRepository = slideRepository;
    }

    public List<Slide> fetchAllSlides(){
        List<SlideEntity> slideEntities = slideRepository.findBySoftDelete(false);
        return slideEntities.stream().map(slideEntity -> mapConfig.getModelMapper().map(slideEntity,Slide.class)).collect(Collectors.toList());
    }
}
