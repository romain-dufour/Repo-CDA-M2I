package org.example.service;

import org.example.entity.Depense;
import org.example.port.DepenseRepository;

import java.util.List;

public class DepenseService {

    private final DepenseRepository depenseRepository;

    public DepenseService(DepenseRepository depenseRepository) {
        this.depenseRepository = depenseRepository;
    }

    public Depense createDepense(double montant, String titre) {
        if (montant<0){
            throw new RuntimeException("Le montant saisie doit etre supérieur à 0");
        }
        Depense depense = new Depense.Builder().montant(montant).titre(titre).build();
        depenseRepository.create(depense);
        return depense;
    }

    public List<Depense> depenses () {
        List<Depense> depenses = depenseRepository.listDepense();
        return depenses;
    }
}