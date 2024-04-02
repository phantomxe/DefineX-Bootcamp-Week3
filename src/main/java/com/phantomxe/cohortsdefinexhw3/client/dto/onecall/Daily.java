package com.phantomxe.cohortsdefinexhw3.client.dto.onecall;

import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter 
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class Daily {
    private Integer dt;
    private Integer sunrise;
    private Integer sunset;
    private Integer moonrise;
    private Integer moonset;
    private Double moon_phase;
    private Temp temp;
    private FeelsLike feels_like;
    private Integer pressure;
    private Integer humidity;
    private Double dew_point;
    private Double wind_speed;
    private Integer wind_deg;
    private Double wind_gust;
    private ArrayList<Weather> weather;
    private Integer clouds;
    private Integer pop;
    private Double uvi;
}
