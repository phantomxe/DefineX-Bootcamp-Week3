package com.phantomxe.cohortsdefinexhw3.client.dto.onecall;

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
public class Weather{
    private Integer id;
    private String main;
    private String description;
    private String icon;
}
