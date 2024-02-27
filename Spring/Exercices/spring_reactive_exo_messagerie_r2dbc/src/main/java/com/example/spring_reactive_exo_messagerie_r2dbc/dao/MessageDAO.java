package com.example.spring_reactive_exo_messagerie_r2dbc.dao;

import com.example.spring_reactive_exo_messagerie_r2dbc.model.Message;
import io.r2dbc.spi.ConnectionFactory;
import org.springframework.r2dbc.core.DatabaseClient;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@Component
public class MessageDAO {

    private final ConnectionFactory connectionFactory;

    private DatabaseClient databaseClient;
    public MessageDAO(ConnectionFactory connectionFactory) {
        this.connectionFactory = connectionFactory;
        databaseClient = DatabaseClient.create(connectionFactory);

        Mono result = databaseClient
                .sql("CREATE TABLE IF NOT EXISTS message(id int primary key auto_increment, sender varchar(100), content varchar(100), message_date_time varchar(100))" )
                                        .then().doOnSuccess((Void) ->  {
                                            System.out.println("Création de la table Ok");
                                        }).doOnError((Void) ->  {
                                         System.out.println("Création de la table Not OK");
                                       });
                             result.subscribe();
    }


    public Flux<Message> getAll() {
        return databaseClient.sql("SELECT * from message").fetch()
                .all()
                .map(m -> Message.builder()
                        .id(Long.valueOf(m.get("id").toString()))
                        .sender(m.get("sender").toString())
                        .content(m.get("content").toString())

                        .build());
    }


    public Mono add(String sender, String content) {
        Map<String, Object> values = new HashMap<>();
        values.put("sender", sender);
        values.put("content", content);
        Mono result = databaseClient.sql("INSERT INTO message (sender, content) values (:sender, :content)")
                .then();
        return result;
    }


}
