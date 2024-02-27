package com.example.spring_reactive_exo_messagerie_r2dbc.repository;

import com.example.spring_reactive_exo_messagerie_r2dbc.model.Message;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface MessageRepository extends R2dbcRepository<Message, Long> {


}
