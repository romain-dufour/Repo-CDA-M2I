package org.example;

@FunctionalInterface
public interface CritereFiltrage {
    abstract boolean filter(Product produit);
}
