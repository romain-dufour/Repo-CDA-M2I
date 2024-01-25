package com.example.exercice1.model;


import javax.persistence.*;
import java.util.Date;

@Entity
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    private String marque;

    private String reference;

    @Temporal(TemporalType.DATE)
    private Date dateAchat;

    private Double prix;

    private int stock;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Produit() {
    }


    public Produit(String marque, String reference, Date dateAchat, Double prix, int stock) {
        this.marque = marque;
        this.reference = reference;
        this.dateAchat = dateAchat;
        this.prix = prix;
        this.stock = stock;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public Date getDateAchat() {
        return dateAchat;
    }

    public void setDateAchat(Date dateAchat) {
        this.dateAchat = dateAchat;
    }

    public Double getPrix() {
        return prix;
    }

    public void setPrix(Double prix) {
        this.prix = prix;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
