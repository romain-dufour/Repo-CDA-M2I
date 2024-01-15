package entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "fournisseur")
public class Fournisseur {
    @Id
    @Column(name = "Numero_fournisseur", nullable = false)
    private Integer id;

    @Column(name = "Nom_fournisseur", length = 50)
    private String nomFournisseur;

    @Column(name = "adresse_fournisseur", length = 250)
    private String adresseFournisseur;

    @Column(name = "Code_Postal_fournisseur")
    private Integer codePostalFournisseur;

    @Column(name = "Ville_fournisseur", length = 50)
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

    public Integer getCodePostalFournisseur() {
        return codePostalFournisseur;
    }

    public void setCodePostalFournisseur(Integer codePostalFournisseur) {
        this.codePostalFournisseur = codePostalFournisseur;
    }

    public String getVilleFournisseur() {
        return villeFournisseur;
    }

    public void setVilleFournisseur(String villeFournisseur) {
        this.villeFournisseur = villeFournisseur;
    }

}