package com.larsan.cateringservicews.entity;

import jakarta.persistence.*;
import lombok.Builder;

@Entity
@Builder
@Table(name = "slide")
public class SlideEntity {

    @Id
    @Column(columnDefinition="uniqueidentifier")
    private String id;

    @Column
    private String imageSrcUrl;

    @Column
    private String description;

    @Column(columnDefinition="BIT")
    private Boolean soft_delete;

}
