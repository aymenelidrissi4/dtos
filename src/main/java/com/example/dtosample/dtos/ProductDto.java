package com.example.dtosample.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class ProductDto {
    private String productName;
    private String brand;

    @JsonProperty("manufacturerName")
    private String manufacturer;

    @JsonProperty("productDetails")
    private ProductDetailsDto productDetails;


    @JsonProperty("reviews")
    private List<ReviewDto> reviews;


    @JsonProperty("productRatings")
    private List<RatingDto> ratings;
}