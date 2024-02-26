package com.example.exercice2_spring_reactive.controller;

import com.example.exercice2_spring_reactive.model.WeatherNews;
import com.example.exercice2_spring_reactive.service.WeatherApiService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("weather")
public class WeatherApiController {

    private final WeatherApiService weatherApiService;

    public WeatherApiController(WeatherApiService weatherApiService) {
        this.weatherApiService = weatherApiService;
    }

    @GetMapping(produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<WeatherNews> get() {
        return weatherApiService.getFlux();
    }

    @PostMapping
    public void post(@RequestBody WeatherNews weatherNews) {
        weatherApiService.sendWeather(weatherNews.getPrevisionMeteo(), weatherNews.getTown());
    }


}
