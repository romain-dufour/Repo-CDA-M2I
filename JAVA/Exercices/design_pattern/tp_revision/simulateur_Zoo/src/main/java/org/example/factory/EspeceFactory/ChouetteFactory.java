package org.example.factory.EspeceFactory;

import org.example.builder.AnimalBuilder;
import org.example.entity.Animal;
import org.example.factory.AnimalFactory;

public class ChouetteFactory extends AnimalFactory {
    @Override
    public Animal createAnimal(AnimalBuilder builder) {
        return builder.build();
    }
}
