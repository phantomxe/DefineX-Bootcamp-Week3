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
public class FeelsLike {
    private Double day;
    private Double night;
    private Double eve;
    private Double morn;
}