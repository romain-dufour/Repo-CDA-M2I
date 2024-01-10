package model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "produit")
public class Produit {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String marque;

    private String reference;

    private LocalDate dateAchat;

    private Double prix;

    private int stock;
    @OneToMany(mappedBy = "produit",cascade = CascadeType.ALL)
    private List<Commentaire> commentaireList;

    @OneToMany(mappedBy = "produit",cascade = CascadeType.ALL)
    private List<Image> imageList;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "commande_produit",
            joinColumns = @JoinColumn(name = "commande_id"),
            inverseJoinColumns = @JoinColumn(name = "produit_id")
    )
    private List<Commande> commandeList;

    public Produit(Long productId, String nouvelleMarque, String nouvelleReference, LocalDate nouvelledueDate, Double nouveauPrice, int nouveauStock) {
    }

    public Produit(Long id, String marque, String reference, LocalDate dateAchat, Double prix, int stock, List<Commentaire> commentaireList, List<Image> imageList) {
        this.id = id;
        this.marque = marque;
        this.reference = reference;
        this.dateAchat = dateAchat;
        this.prix = prix;
        this.stock = stock;
        this.commentaireList = commentaireList;
        this.imageList = imageList;
    }

    public List<Commentaire> getCommentaireList() {
        return commentaireList;
    }

    public void setCommentaireList(List<Commentaire> commentaireList) {
        this.commentaireList = commentaireList;
    }

    public List<Image> getImageList() {
        return imageList;
    }

    public void setImageList(List<Image> imageList) {
        this.imageList = imageList;
    }

    public Produit() {
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public LocalDate getDateAchat() {
        return dateAchat;
    }

    public void setDateAchat(LocalDate dateAchat) {
        this.dateAchat = dateAchat;
    }

    public Double getPrix() {
        return prix;
    }

    public void setPrix(Double prix) {
        this.prix = prix;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Produit{" +
                "id=" + id +
                ", marque='" + marque + '\'' +
                ", reference='" + reference + '\'' +
                ", dateAchat=" + dateAchat +
                ", prix=" + prix +
                ", stock=" + stock +
                '}';
    }
}
