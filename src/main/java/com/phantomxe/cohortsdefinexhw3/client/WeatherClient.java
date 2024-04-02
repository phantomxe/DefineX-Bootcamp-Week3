package com.phantomxe.cohortsdefinexhw3.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.phantomxe.cohortsdefinexhw3.client.dto.CityResponse;
import com.phantomxe.cohortsdefinexhw3.client.dto.OneCallResponse;

@FeignClient(name = "weather", url = "https://openweathermap.org/")
public interface WeatherClient {

    @GetMapping("data/2.5/onecall")
    public OneCallResponse getWeather(@RequestParam String lat, @RequestParam String lon, @RequestParam String units, @RequestParam String appid);
    
    @GetMapping("data/2.5/find")
    public CityResponse getCity(@RequestParam String q, @RequestParam String units, @RequestParam String appid);

}
