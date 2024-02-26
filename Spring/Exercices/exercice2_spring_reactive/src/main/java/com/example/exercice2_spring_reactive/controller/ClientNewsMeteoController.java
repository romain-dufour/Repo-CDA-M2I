package com.example.exercice2_spring_reactive.controller;

import com.example.exercice2_spring_reactive.model.InfoNews;
import com.example.exercice2_spring_reactive.model.WeatherNews;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

import java.time.Duration;

@RestController
@RequestMapping("clientnewsmeteo")
public class ClientNewsMeteoController {

    private WebClient webClient;

    public ClientNewsMeteoController() {webClient = WebClient.builder().baseUrl("http://localhost:8080").build();}

    @GetMapping
    @RequestMapping("zip")
    public Flux<Object> getZip() {
        Flux<InfoNews> flux1 =  this.webClient.get().uri("/news")
                .retrieve()
                .bodyToFlux(InfoNews.class);

        Flux<WeatherNews> flux2 = this.webClient.get().uri("/weather")
                .retrieve()
                .bodyToFlux(WeatherNews.class);

        return Flux.zip(flux1, flux2).map(t -> "la nouvelle news " + t.getT1().getContent() + " avec la meteo " +t.getT2().getPrevisionMeteo() + "dans la ville " + t.getT2().getTown());
    }








}
