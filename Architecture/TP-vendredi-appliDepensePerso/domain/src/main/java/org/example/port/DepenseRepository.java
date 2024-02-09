package org.example.port;

import org.example.entity.Depense;

import java.util.List;

public interface DepenseRepository {
    
    void create(Depense depense);
    List<Depense> listDepense();
}
