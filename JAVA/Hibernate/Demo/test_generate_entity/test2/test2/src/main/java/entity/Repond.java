package entity;

import jakarta.persistence.*;

@Entity
@Table(name = "reponds")
public class Repond {
    @EmbeddedId
    private RepondId id;

    @MapsId("numeroFournisseur")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "numero_fournisseur", nullable = false)
    private Entite7 numeroFournisseur;

    @MapsId("numeroOffre")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "numero_offre", nullable = false)
    private AppelOffre numeroOffre;

    public RepondId getId() {
        return id;
    }

    public void setId(RepondId id) {
        this.id = id;
    }

    public Entite7 getNumeroFournisseur() {
        return numeroFournisseur;
    }

    public void setNumeroFournisseur(Entite7 numeroFournisseur) {
        this.numeroFournisseur = numeroFournisseur;
    }

    public AppelOffre getNumeroOffre() {
        return numeroOffre;
    }

    public void setNumeroOffre(AppelOffre numeroOffre) {
        this.numeroOffre = numeroOffre;
    }

}