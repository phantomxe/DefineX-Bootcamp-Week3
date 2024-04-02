package com.phantomxe.cohortsdefinexhw3.client.dto;

import java.util.List;

import com.phantomxe.cohortsdefinexhw3.client.dto.findcity.City;

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
public class CityResponse {
    private String message;
    private String cod;
    private Integer count;
    private List<City> list;
}
