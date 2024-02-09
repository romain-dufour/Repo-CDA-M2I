package org.example.infra.orm.entity;

;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.entity.Depense;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DepenseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private double montant;
    private String titre;
    public Depense toDepense() {return new Depense.Builder().montant(montant).titre(titre).build();}

}
