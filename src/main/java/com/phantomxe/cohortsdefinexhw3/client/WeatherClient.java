package com.phantomxe.cohortsdefinexhw3.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.phantomxe.cohortsdefinexhw3.client.dto.OneCallResponse;

@FeignClient(name = "weather", url = "https://openweathermap.org/")
public interface WeatherClient {

    @GetMapping("data/2.5/onecall")
    public OneCallResponse getWeather(@RequestParam String lat, @RequestParam String lon, @RequestParam String metric, @RequestParam String appid);
    
}
