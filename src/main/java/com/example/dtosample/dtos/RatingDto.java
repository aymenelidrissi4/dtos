package com.example.dtosample.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class RatingDto {
    @JsonProperty("id")
    private long id;

    @JsonProperty("ratingValue")
    private double ratingValue;
}