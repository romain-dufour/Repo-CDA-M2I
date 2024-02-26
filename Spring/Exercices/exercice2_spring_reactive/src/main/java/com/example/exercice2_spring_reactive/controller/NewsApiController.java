package com.example.exercice2_spring_reactive.controller;

import com.example.exercice2_spring_reactive.model.InfoNews;
import com.example.exercice2_spring_reactive.service.NewsApiService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
@RestController
@RequestMapping("news")
public class NewsApiController {


    private final NewsApiService newsApiService;

    public NewsApiController(NewsApiService newsApiService) {
        this.newsApiService = newsApiService;
    }


    @PostMapping
    public void post(@RequestBody InfoNews infoNews) {
        newsApiService.sendInfoNews(infoNews.getSender(), infoNews.getContent());
    }


    @GetMapping(produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<InfoNews> get() {
        return newsApiService.getFlux();
    }
}
