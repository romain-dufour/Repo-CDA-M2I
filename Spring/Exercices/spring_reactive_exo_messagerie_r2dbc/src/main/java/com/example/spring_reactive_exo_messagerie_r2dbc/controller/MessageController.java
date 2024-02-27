package com.example.spring_reactive_exo_messagerie_r2dbc.controller;


import com.example.spring_reactive_exo_messagerie_r2dbc.dao.MessageDAO;
import com.example.spring_reactive_exo_messagerie_r2dbc.dto.MessageDTO;
import com.example.spring_reactive_exo_messagerie_r2dbc.model.Message;
import com.example.spring_reactive_exo_messagerie_r2dbc.repository.MessageRepository;
import com.example.spring_reactive_exo_messagerie_r2dbc.service.MessageService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("messages")
public class MessageController {

    private final MessageDAO messageDAO;
    private final MessageRepository messageRepository;

    public MessageController(MessageDAO messageDAO,MessageRepository messageRepository) {
        this.messageDAO = messageDAO;
        this.messageRepository = messageRepository;
    }

    @PostMapping
    public Mono<Message> post(@RequestBody Message message) {
        return messageRepository.save(message);

    }


    @GetMapping(produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<Message> get() {
        return messageRepository.findAll();
    }
//
//    @GetMapping()
//    public Mono<Message> get(@PathVariable("id") long id) {
//        return addressRepository.findById(id).flatMap(address ->
//                personRepository.findById((long) address.getPersonId())
//                        .map(p->  {
//                            address.setPerson(p);
//                            return address;
//                        })
//        );
//    }
//    @PostMapping
//    public void post(@RequestBody MessageDTO messageDTO) {
//        messageService.sendMessage(messageDTO.getSender(), messageDTO.getContent());
//    }
}
