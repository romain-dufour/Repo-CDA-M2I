package com.example.exercice2_spring_reactive.service;

import com.example.exercice2_spring_reactive.model.WeatherNews;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Sinks;

import java.time.LocalDateTime;

@Service
public class WeatherApiService {

    private final Sinks.Many<WeatherNews> sink;

    public WeatherApiService() {
        sink = Sinks.many().multicast().onBackpressureBuffer();
    }

    public void sendWeather(String prevision, String town) {
        sink.tryEmitNext(WeatherNews.builder().previsionMeteo(prevision).town(town).previsionDateTime(LocalDateTime.now()).build());
    }

    public Flux<WeatherNews> getFlux() {
        return sink.asFlux();
    }


}
