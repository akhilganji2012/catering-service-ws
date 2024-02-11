package com.larsan.cateringservicews.controller;

import com.larsan.cateringservicews.model.Slide;
import com.larsan.cateringservicews.service.SlideService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/slide")
public class SlideController {
    private final SlideService slideService;

    public SlideController(SlideService slideService) {
        this.slideService = slideService;
    }

    @GetMapping("/all")
    public List<Slide> fetchAllSlides(){
        return slideService.fetchAllSlides();
    }
}
