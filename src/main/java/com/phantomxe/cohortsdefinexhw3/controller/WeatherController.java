package com.phantomxe.cohortsdefinexhw3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.phantomxe.cohortsdefinexhw3.service.WeatherService;

@RestController
@RequestMapping("api/weather")
public class WeatherController {
    
    @Autowired
    private WeatherService weatherService;
}
