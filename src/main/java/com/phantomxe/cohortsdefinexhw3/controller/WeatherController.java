package com.phantomxe.cohortsdefinexhw3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.phantomxe.cohortsdefinexhw3.client.dto.onecall.Daily;
import com.phantomxe.cohortsdefinexhw3.service.WeatherService;

@RestController
@RequestMapping("api/weather")
public class WeatherController {
    
    @Autowired
    private WeatherService weatherService;

    @GetMapping("/daily/{cityName}")
    public Daily getDaily(@PathVariable String cityName) {
        return weatherService.getDailyListByCityName(cityName).get(0);
    }

    @GetMapping("/weekly/{cityName}")
    public List<Daily> getWeekly(@PathVariable String cityName) {
        return weatherService.getDailyListByCityName(cityName);
    }
}
