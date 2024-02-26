package com.example.exercice2_spring_reactive.model;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class WeatherNews {

    private String previsionMeteo;
    private String town;
    private LocalDateTime previsionDateTime;
}
