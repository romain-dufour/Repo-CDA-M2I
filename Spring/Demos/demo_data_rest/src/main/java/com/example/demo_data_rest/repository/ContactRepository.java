package com.example.demo_data_rest.repository;

import com.example.demo_data_rest.entity.Contact;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(path = "contact", collectionResourceRel = "toto") //modifier le path de base qui est au pluriel (contacts) , collectionRessourceRel pour changer le nom de la liste
public interface ContactRepository extends CrudRepository<Contact, Long> {
}
