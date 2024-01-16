package entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "entite9")
public class Entite9 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "numero_contrat", nullable = false)
    private Integer id;

    @Column(name = "date_contrat", nullable = false)
    private LocalDate dateContrat;

    @Column(name = "quantite_negocie", nullable = false)
    private Float quantiteNegocie;

    @Column(name = "acceptation_refus", nullable = false)
    private Boolean acceptationRefus = false;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "numero_fournisseur", nullable = false)
    private Entite7 numeroFournisseur;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "Numero_produit", nullable = false)
    private Entite8 numeroProduit;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getDateContrat() {
        return dateContrat;
    }

    public void setDateContrat(LocalDate dateContrat) {
        this.dateContrat = dateContrat;
    }

    public Float getQuantiteNegocie() {
        return quantiteNegocie;
    }

    public void setQuantiteNegocie(Float quantiteNegocie) {
        this.quantiteNegocie = quantiteNegocie;
    }

    public Boolean getAcceptationRefus() {
        return acceptationRefus;
    }

    public void setAcceptationRefus(Boolean acceptationRefus) {
        this.acceptationRefus = acceptationRefus;
    }

    public Entite7 getNumeroFournisseur() {
        return numeroFournisseur;
    }

    public void setNumeroFournisseur(Entite7 numeroFournisseur) {
        this.numeroFournisseur = numeroFournisseur;
    }

    public Entite8 getNumeroProduit() {
        return numeroProduit;
    }

    public void setNumeroProduit(Entite8 numeroProduit) {
        this.numeroProduit = numeroProduit;
    }

}