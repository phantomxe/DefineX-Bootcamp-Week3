package com.phantomxe.cohortsdefinexhw3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.phantomxe.cohortsdefinexhw3.client.WeatherClient;
import com.phantomxe.cohortsdefinexhw3.client.dto.CityResponse;
import com.phantomxe.cohortsdefinexhw3.client.dto.OneCallResponse;
import com.phantomxe.cohortsdefinexhw3.client.dto.findcity.Coordinates;
import com.phantomxe.cohortsdefinexhw3.client.dto.onecall.Daily;
import com.phantomxe.exceptions.CityException;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class WeatherService {

    @Value("${weather.appid}")
    private String weatherAppId;
    
    @Autowired
    private WeatherClient weatherClient;

    public List<Daily> getDailyListByCityName(String cityName) {
        CityResponse mycity = weatherClient.getCity(cityName, "metric", weatherAppId);
        log.info(mycity.toString());

        if(mycity.getCount().equals(0)) {
            throw new CityException("City not found");
        }

        Coordinates mycoords = mycity.getList().getFirst().getCoord();

        OneCallResponse result = weatherClient.getWeather(
            String.format("%.2f", mycoords.getLat()), 
            String.format("%.2f", mycoords.getLon()),
            "metric",
            weatherAppId);

        //log.info(result.toString());

        return result.getDaily();
    }
}
