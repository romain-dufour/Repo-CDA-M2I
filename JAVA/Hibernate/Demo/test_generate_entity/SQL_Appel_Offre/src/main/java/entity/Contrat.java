package entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "contrat")
public class Contrat {
    @Id
    @Column(name = "Numero_contrat", nullable = false)
    private Integer id;

    @Column(name = "Date_contrat")
    private LocalDate dateContrat;

    @Column(name = "`Quantité_négociée`", precision = 15, scale = 2)
    private BigDecimal quantitéNégociée;

    @Column(name = "acceptation_refus")
    private Boolean acceptationRefus;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "Numero_produit", nullable = false)
    private Produit numeroProduit;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "Numero_fournisseur", nullable = false)
    private Fournisseur numeroFournisseur;

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

    public BigDecimal getQuantitéNégociée() {
        return quantitéNégociée;
    }

    public void setQuantitéNégociée(BigDecimal quantitéNégociée) {
        this.quantitéNégociée = quantitéNégociée;
    }

    public Boolean getAcceptationRefus() {
        return acceptationRefus;
    }

    public void setAcceptationRefus(Boolean acceptationRefus) {
        this.acceptationRefus = acceptationRefus;
    }

    public Produit getNumeroProduit() {
        return numeroProduit;
    }

    public void setNumeroProduit(Produit numeroProduit) {
        this.numeroProduit = numeroProduit;
    }

    public Fournisseur getNumeroFournisseur() {
        return numeroFournisseur;
    }

    public void setNumeroFournisseur(Fournisseur numeroFournisseur) {
        this.numeroFournisseur = numeroFournisseur;
    }

}