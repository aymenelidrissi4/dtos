package com.example.dtosample.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ReviewDto {
    @JsonProperty("id")
    private long id;

    @JsonProperty("comment")
    private String reviewComment;
}