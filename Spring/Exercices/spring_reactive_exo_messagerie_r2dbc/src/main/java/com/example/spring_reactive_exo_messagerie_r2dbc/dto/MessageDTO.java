package com.example.spring_reactive_exo_messagerie_r2dbc.dto;

import lombok.Data;

@Data
public class MessageDTO {
    private String content;
    private String sender;
}
