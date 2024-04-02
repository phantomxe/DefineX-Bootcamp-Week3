package com.phantomxe.cohortsdefinexhw3.client.dto.onecall;

import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor; 
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter 
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class Current {
    private Integer dt;
    private Integer sunrise;
    private Integer sunset;
    private Double temp;
    private Double feels_like;
    private Integer pressure;
    private Integer humidity;
    private Double dew_poInteger;
    private Double uvi;
    private Integer clouds;
    private Integer visibility;
    private Double wind_speed;
    private Integer wind_deg;
    private Double wind_gust;
    private ArrayList<Weather> weather;
}
