package entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "appel_d_offre")
public class AppelDOffre {
    @Id
    @Column(name = "numero_offre", nullable = false)
    private Integer id;

    @Column(name = "date_offre")
    private LocalDate dateOffre;

    @Column(name = "date_cloture_offre")
    private LocalDate dateClotureOffre;

    @Column(name = "`Quantité`")
    private Integer quantité;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "Numero_produit", nullable = false)
    private Produit numeroProduit;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getDateOffre() {
        return dateOffre;
    }

    public void setDateOffre(LocalDate dateOffre) {
        this.dateOffre = dateOffre;
    }

    public LocalDate getDateClotureOffre() {
        return dateClotureOffre;
    }

    public void setDateClotureOffre(LocalDate dateClotureOffre) {
        this.dateClotureOffre = dateClotureOffre;
    }

    public Integer getQuantité() {
        return quantité;
    }

    public void setQuantité(Integer quantité) {
        this.quantité = quantité;
    }

    public Produit getNumeroProduit() {
        return numeroProduit;
    }

    public void setNumeroProduit(Produit numeroProduit) {
        this.numeroProduit = numeroProduit;
    }

}