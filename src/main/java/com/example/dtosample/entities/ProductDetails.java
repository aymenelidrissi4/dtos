package com.example.dtosample.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class ProductDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int productDetailsId;
    private String technicalSpecifications;
    private String specialFeatures;
    private String extendedDescription;
}