package com.example.demo_spring_reactive.service;

import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Sinks;

@Service
public class NewsService {

    // un sink multicast qui permet de pousser des éléments vers plusieurs subscriber
    private final Sinks.Many<String> sink;

    public NewsService(){
        sink = Sinks.many().multicast().onBackpressureBuffer();
//        sink.tryEmitComplete();
    }

    public void sendsNews(String news) {
        sink.tryEmitNext(news);
    }


    public Flux<String> getFlux() {
        return sink.asFlux();
    }
}
