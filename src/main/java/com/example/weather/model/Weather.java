package com.example.weather.model;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@Builder
public class Weather {

    private Long id;

    private String location;

    private Coordinate coordinate;

    private LocalDateTime time;

    private int degree;
}
