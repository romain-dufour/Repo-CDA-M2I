package org.example.model;

import lombok.Data;

import java.util.List;

@Data
public class Departement {
    private int id;
    private String name;
    private List<Salarie> salarieList;

}
