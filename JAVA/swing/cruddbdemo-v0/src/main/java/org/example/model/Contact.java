package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Contact {

    private int id;
    private String name, number;

    public Contact() {

    }
}
