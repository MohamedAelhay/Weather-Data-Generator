package com.example.weather.controller;

import com.example.weather.model.Weather;
import com.example.weather.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(WeatherController.WEATHER_ROOT_PATH)
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    public static final String WEATHER_ROOT_PATH = "/weather";

    @GetMapping
    public List<Weather> getWeather() {
        return weatherService.getAllCountriesWeather();
    }
}
