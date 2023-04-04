package com.example.weather.service.impl;

import com.example.weather.model.Coordinate;
import com.example.weather.service.CoordinateService;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class CoordinateServiceImpl implements CoordinateService {

    @Override
    public Coordinate CoordinateGenerator() {

        return Coordinate.builder()
                .lat(new Random().nextDouble())
                .lng(new Random().nextDouble())
                .build();
    }
}
