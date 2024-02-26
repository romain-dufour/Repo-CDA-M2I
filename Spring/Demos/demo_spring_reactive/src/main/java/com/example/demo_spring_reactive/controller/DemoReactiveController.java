package com.example.demo_spring_reactive.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import org.springframework.http.MediaType;

import java.time.Duration;


@RestController
@RequestMapping("reactives")
public class DemoReactiveController {

    @GetMapping
    public Mono<String> get() {
        return Mono.just("Hello from get method");
    }


//    @GetMapping("flux")
//    public Flux<String> getFlux() {
//        // le serveur web est synchrone donc renvoie toute la requete a la fin
//        return Flux.just("toto", "tata", "titi").delayElements(Duration.ofSeconds(2));
//    }


    // produces media texte event stream value indique au serveur de s'adapter a un flux asynchrone
        @GetMapping(value = "flux", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<String> getFlux() {

        return Flux.just("toto", "tata", "titi").delayElements(Duration.ofSeconds(2));
    }
}
