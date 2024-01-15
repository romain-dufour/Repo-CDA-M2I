package entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.math.BigDecimal;

@Entity
@Table(name = "produit")
public class Produit {
    @Id
    @Column(name = "Numero_produit", nullable = false)
    private Integer id;

    @Column(name = "Nom_produit", length = 50)
    private String nomProduit;

    @Column(name = "Prix_produit", precision = 15, scale = 2)
    private BigDecimal prixProduit;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomProduit() {
        return nomProduit;
    }

    public void setNomProduit(String nomProduit) {
        this.nomProduit = nomProduit;
    }

    public BigDecimal getPrixProduit() {
        return prixProduit;
    }

    public void setPrixProduit(BigDecimal prixProduit) {
        this.prixProduit = prixProduit;
    }

}