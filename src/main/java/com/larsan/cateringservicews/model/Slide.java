package com.larsan.cateringservicews.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Slide {
    private UUID id;
    private String imageSrcUrl;
    private String description;
}
