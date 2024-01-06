package models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "compte_bancaire")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String libelle;

    @Column(name = "IBAN",nullable = false,length = 27)
    private Long Iban;

    @Column(precision = 10, scale = 2)
    private Double solde;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Person person;
    @ManyToOne
    @JoinColumn(name = "agence_id")
    private Agency agency;

    @ManyToMany(mappedBy = "accountList")
    private List<Person> personList = new ArrayList<>();

    public Account() {
    }


    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public Long getIban() {
        return Iban;
    }

    public void setIban(Long iban) {
        Iban = iban;
    }

    public Double getSolde() {
        return solde;
    }

    public void setSolde(Double solde) {
        this.solde = solde;
    }

    public Agency getAgency() {
        return agency;
    }

    public void setAgency(Agency agency) {
        this.agency = agency;
    }

    public List<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(List<Person> personList) {
        this.personList = personList;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
