package com.phantomxe.cohortsdefinexhw3.client.dto;

import java.util.ArrayList;

import com.phantomxe.cohortsdefinexhw3.client.dto.onecall.Current;
import com.phantomxe.cohortsdefinexhw3.client.dto.onecall.Daily;

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
public class OneCallResponse {
    private Double lat;
    private Double lon;
    private String timezone;
    private Integer timezone_offset;
    private Current current; 
    private ArrayList<Daily> daily;
} 