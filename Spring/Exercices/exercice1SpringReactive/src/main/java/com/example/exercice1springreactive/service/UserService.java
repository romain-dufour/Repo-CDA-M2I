package com.example.exercice1springreactive.service;

import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Sinks;

@Service
public class UserService {

    private final Sinks.Many<String> sink;

    public UserService(){
        sink = Sinks.many().multicast().onBackpressureBuffer();
    }

    public void sendMessage(String message, String sender, String time) {
        String formattedMessage = String.format("%s [%s]: %s", time, sender, message);
        sink.tryEmitNext(formattedMessage).orThrow();
    }


    public Flux<String> getFlux() {
        return sink.asFlux();
    }}
