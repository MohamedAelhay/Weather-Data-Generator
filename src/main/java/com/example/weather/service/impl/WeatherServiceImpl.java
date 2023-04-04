package com.example.weather.service.impl;

import com.example.weather.model.CountryEnum;
import com.example.weather.model.Weather;
import com.example.weather.service.CoordinateService;
import com.example.weather.service.WeatherService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class WeatherServiceImpl implements WeatherService {

    @Autowired
    private final CoordinateService coordinateService;

    private Weather weatherGenerator(final CountryEnum country) {

        return Weather.builder()
                .id(country.id)
                .time(LocalDateTime.now())
                .location(country.countryName)
                .degree((int) (1 + Math.random() * 45))
                .coordinate(coordinateService.CoordinateGenerator())
                .build();
    }

    @Override
    public List<Weather> getAllCountriesWeather() {

        return Arrays.stream(CountryEnum.values()).map(this::weatherGenerator).collect(Collectors.toList());
    }
}
