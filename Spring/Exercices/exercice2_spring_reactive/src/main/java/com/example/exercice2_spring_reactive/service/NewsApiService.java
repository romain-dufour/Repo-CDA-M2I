package com.example.exercice2_spring_reactive.service;

import com.example.exercice2_spring_reactive.model.InfoNews;
import com.example.exercice2_spring_reactive.model.WeatherNews;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Sinks;

import java.time.LocalDateTime;
@Service
public class NewsApiService {

    private final Sinks.Many<InfoNews> sink;

    public NewsApiService() {
        sink = Sinks.many().multicast().onBackpressureBuffer();
    }

    public void sendInfoNews(String sender, String content) {
        sink.tryEmitNext(InfoNews.builder().sender(sender).content(content).messageDateTime(LocalDateTime.now()).build());
    }

    public Flux<InfoNews> getFlux() {
        return sink.asFlux();
    }

}
