package entity;

import jakarta.persistence.*;

@Entity
@Table(name = "reponds")
public class Repond {
    @EmbeddedId
    private RepondId id;

    @MapsId("numeroOffre")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "numero_offre", nullable = false)
    private AppelDOffre numeroOffre;

    @MapsId("numeroFournisseur")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "Numero_fournisseur", nullable = false)
    private Fournisseur numeroFournisseur;

    public RepondId getId() {
        return id;
    }

    public void setId(RepondId id) {
        this.id = id;
    }

    public AppelDOffre getNumeroOffre() {
        return numeroOffre;
    }

    public void setNumeroOffre(AppelDOffre numeroOffre) {
        this.numeroOffre = numeroOffre;
    }

    public Fournisseur getNumeroFournisseur() {
        return numeroFournisseur;
    }

    public void setNumeroFournisseur(Fournisseur numeroFournisseur) {
        this.numeroFournisseur = numeroFournisseur;
    }

}