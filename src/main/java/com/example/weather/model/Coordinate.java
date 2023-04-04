package com.example.weather.model;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Coordinate {

    private Double lat;

    private Double lng;
}
