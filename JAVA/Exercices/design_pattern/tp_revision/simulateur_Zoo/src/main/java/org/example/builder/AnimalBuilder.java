package org.example.builder;

import org.example.entity.Animal;
import org.example.Comportement;

public abstract class AnimalBuilder {
    public abstract AnimalBuilder espece(String espace);
    public abstract AnimalBuilder name (String name);
    public abstract AnimalBuilder taille (double taille);
    public abstract AnimalBuilder comportement(Comportement comportement);

    public abstract Animal build();
}
