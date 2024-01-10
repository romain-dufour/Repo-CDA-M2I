package model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Commande {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToMany(mappedBy = "commandeList", fetch = FetchType.LAZY)
    private List<Produit> produitList;

    private double total;

    private LocalDate dateCommande;

    @OneToOne(mappedBy ="commande", cascade = CascadeType.ALL, orphanRemoval = true)
    private Adresse adresse;


    public Commande() {
    }

    public List<Produit> getProduitList() {
        return produitList;
    }

    public void setProduitList(List<Produit> produitList) {
        this.produitList = produitList;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public LocalDate getDateCommande() {
        return dateCommande;
    }

    public void setDateCommande(LocalDate dateCommande) {
        this.dateCommande = dateCommande;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
