package entity;

import jakarta.persistence.*;

@Entity
@Table(name = "entite7")
public class Entite7 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "numero_fournisseur", nullable = false)
    private Integer id;

    @Column(name = "nom_fournisseur", nullable = false, length = 250)
    private String nomFournisseur;

    @Column(name = "adresse_fournisseur", nullable = false, length = 250)
    private String adresseFournisseur;

    @Column(name = "code_postal", nullable = false)
    private Integer codePostal;

    @Column(name = "ville_fournisseur", nullable = false, length = 50)
    private String villeFournisseur;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomFournisseur() {
        return nomFournisseur;
    }

    public void setNomFournisseur(String nomFournisseur) {
        this.nomFournisseur = nomFournisseur;
    }

    public String getAdresseFournisseur() {
        return adresseFournisseur;
    }

    public void setAdresseFournisseur(String adresseFournisseur) {
        this.adresseFournisseur = adresseFournisseur;
    }

    public Integer getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(Integer codePostal) {
        this.codePostal = codePostal;
    }

    public String getVilleFournisseur() {
        return villeFournisseur;
    }

    public void setVilleFournisseur(String villeFournisseur) {
        this.villeFournisseur = villeFournisseur;
    }

}