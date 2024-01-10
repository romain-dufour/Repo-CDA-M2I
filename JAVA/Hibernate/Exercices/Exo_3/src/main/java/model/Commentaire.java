package model;


import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Commentaire {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Produit produit;

    private String contenu;

    private LocalDate Date;

    private double note;

    public Commentaire() {
    }

    public Commentaire(Long id, Produit produit, String contenu, LocalDate date, double note) {
        this.id = id;
        this.produit = produit;
        this.contenu = contenu;
        Date = date;
        this.note = note;
    }

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }

    public String getContenu() {
        return contenu;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    public LocalDate getDate() {
        return Date;
    }

    public void setDate(LocalDate date) {
        Date = date;
    }

    public double getNote() {
        return note;
    }

    public void setNote(double note) {
        this.note = note;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Commentaire{" +
                "id=" + id +
                ", contenu='" + contenu + '\'' +
                ", Date=" + Date +
                ", note=" + note +
                '}';
    }
}
