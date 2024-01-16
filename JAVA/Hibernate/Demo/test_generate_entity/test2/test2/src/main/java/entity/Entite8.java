package entity;

import jakarta.persistence.*;

@Entity
@Table(name = "entite8")
public class Entite8 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Numero_produit", nullable = false)
    private Integer id;

    @Column(name = "nom_produit", nullable = false, length = 250)
    private String nomProduit;

    @Column(name = "prix_produit", nullable = false)
    private Float prixProduit;

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

    public Float getPrixProduit() {
        return prixProduit;
    }

    public void setPrixProduit(Float prixProduit) {
        this.prixProduit = prixProduit;
    }

}