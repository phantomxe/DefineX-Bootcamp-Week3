package com.phantomxe.cohortsdefinexhw3.client.dto.findcity;

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
public class Coordinates {
    private Double lat;
    private Double lon;
}
