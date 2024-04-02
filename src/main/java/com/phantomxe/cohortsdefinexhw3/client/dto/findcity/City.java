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
public class City {
    private Integer id;
    private String name;
    private Coordinates coord;
    //I dont need others
}
