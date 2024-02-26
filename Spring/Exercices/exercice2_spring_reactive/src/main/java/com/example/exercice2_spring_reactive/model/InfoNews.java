package com.example.exercice2_spring_reactive.model;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
@Data
@Builder
public class InfoNews {

    private String sender;
    private String content;
    private LocalDateTime messageDateTime;
}
