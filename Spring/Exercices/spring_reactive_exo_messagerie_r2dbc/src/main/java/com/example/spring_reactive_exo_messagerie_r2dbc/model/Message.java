package com.example.spring_reactive_exo_messagerie_r2dbc.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
public class Message {
    @Id
    private Long id;
    private String sender;
    private String content;
    private LocalDateTime messageDateTime;


    public Message() {
        this.messageDateTime = LocalDateTime.now();
    }
}
