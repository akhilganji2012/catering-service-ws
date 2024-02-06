package com.larsan.cateringservicews.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;

@Entity
@Builder
@Table(name = "customer")
public class CustomerEntity {
    @Id
    @Column(columnDefinition="uniqueidentifier")
    private String id;

    @Column(columnDefinition="BIT")
    private Boolean soft_delete;

    @Column
    private String firstName;

    @Column
    private String lastName;

    @Column
    private String phone;

    @Column
    private String email;
}
