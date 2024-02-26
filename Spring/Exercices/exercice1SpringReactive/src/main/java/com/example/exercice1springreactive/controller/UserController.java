package com.example.exercice1springreactive.controller;


import com.example.exercice1springreactive.service.UserService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestController
@RequestMapping("chat")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }


    @GetMapping("add/{message}")
    public ResponseEntity<String> addMessage(@PathVariable("message") String message) {
        String sender = "John Doe"; // Remplacez cela par l'émetteur réel
        String time = LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));

        this.userService.sendMessage(message, sender, time);
        return ResponseEntity.ok("Ok");
    }

    @GetMapping(produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<String> get() {
        return userService.getFlux();
    }
}
