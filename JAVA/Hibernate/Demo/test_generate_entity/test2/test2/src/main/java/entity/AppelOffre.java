package entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "appel_offre")
public class AppelOffre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "numero_offre", nullable = false)
    private Integer id;

    @Column(name = "date_offre", nullable = false)
    private LocalDate dateOffre;

    @Column(name = "date_cloture_pffre", nullable = false)
    private LocalDate dateCloturePffre;

    @Column(name = "quantite", nullable = false)
    private Integer quantite;

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

    public LocalDate getDateCloturePffre() {
        return dateCloturePffre;
    }

    public void setDateCloturePffre(LocalDate dateCloturePffre) {
        this.dateCloturePffre = dateCloturePffre;
    }

    public Integer getQuantite() {
        return quantite;
    }

    public void setQuantite(Integer quantite) {
        this.quantite = quantite;
    }

}