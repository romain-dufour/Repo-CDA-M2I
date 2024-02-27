package com.example.demo_r2dbc.dao;


import com.example.demo_r2dbc.entity.Person;
import io.r2dbc.spi.ConnectionFactory;
import org.springframework.r2dbc.core.DatabaseClient;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@Component
public class PersonDAO {

    private final ConnectionFactory connectionFactory;

    private DatabaseClient databaseClient;
    public PersonDAO(ConnectionFactory connectionFactory) {
        this.connectionFactory = connectionFactory;
        databaseClient = DatabaseClient.create(connectionFactory);
        Mono result = databaseClient
                .sql("CREATE TABLE IF NOT EXISTS person(id int primary key auto_increment, firstname varchar(100), lastname varchar(100))")
                .then().doOnSuccess((Void) ->  {
                    System.out.println("Création de la table OK");
                }).doOnError((Void) ->  {
                    System.out.println("Création de la table Not OK");
                });
        result.subscribe();
    }

    public Flux<Person> getAll() {
        return databaseClient.sql("SELECT * from person").fetch()
                .all()
                .map(m -> Person.builder()
                        .id(Integer.valueOf(m.get("id").toString()))
                        .firstname(m.get("firstname").toString())
                        .lastname(m.get("lastname").toString())
                        .build());
    }

    public Mono add(String firstname, String lastname) {
        Map<String, Object> values = new HashMap<>();
        values.put("firstname", firstname);
        values.put("lastname", lastname);
        Mono result = databaseClient.sql("INSERT INTO person (firstname, lastname) values (:firstname, :lastname)")
                //.bind("firstname", firstname).bind("lastname", lastname)
                .bindValues(values)
                .then();
        return result;
    }

    public Mono delete(int id) {
        return databaseClient.sql("DELETE FROM person where id=:id").bind("id", id).then();
    }

    public Mono update(int id, String newFirstname, String newLastname) {
        // Récupérer la Person existante
        Mono<Person> existingPersonMono = databaseClient
                .sql("SELECT * FROM person WHERE id = :id")
                .bind("id", id)
                .fetch()
                .one()
                .map(m -> Person.builder()
                        .id(Integer.valueOf(m.get("id").toString()))
                        .firstname(m.get("firstname").toString())
                        .lastname(m.get("lastname").toString())
                        .build());

// Mettre à jour la Person existante
        return existingPersonMono.flatMap(existingPerson -> {
            existingPerson.setFirstname(newFirstname);
            existingPerson.setLastname(newLastname);

            Map<String, Object> values = new HashMap<>();
            values.put("id", existingPerson.getId());
            values.put("firstname", existingPerson.getFirstname());
            values.put("lastname", existingPerson.getLastname());

            // Exécuter la mise à jour
            return databaseClient.sql("UPDATE person SET firstname = :firstname, lastname = :lastname WHERE id = :id")
                    .bindValues(values)
                    .then();
        });
    // version cours (rowsupdated pour connaitre le nombre de lignes modifiée, pas besoin de faire un getByID car on fait la requete sql update qui sert a ca
//        public Mono<Long> update(int id, String firstname, String lastname) {
//            Map<String, Object> values = new HashMap<>();
//            values.put("firstname", firstname);
//            values.put("lastname", lastname);
//            values.put("id", id);
//            return databaseClient
//                    .sql("UPDATE person set firstname = :firstname, lastname =:lastname where id = :id")
//                    .bindValues(values).fetch().rowsUpdated();
//        }
    }
    }
