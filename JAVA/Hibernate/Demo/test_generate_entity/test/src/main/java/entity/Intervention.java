package entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "intervention")
public class Intervention {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_intervention", nullable = false)
    private Integer id;

    @Column(name = "description_intervention", nullable = false, length = 250)
    private String descriptionIntervention;

    @Column(name = "date_intervention", nullable = false)
    private LocalDate dateIntervention;

    @Column(name = "nombre_jour", nullable = false)
    private Integer nombreJour;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_client", nullable = false)
    private Client idClient;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescriptionIntervention() {
        return descriptionIntervention;
    }

    public void setDescriptionIntervention(String descriptionIntervention) {
        this.descriptionIntervention = descriptionIntervention;
    }

    public LocalDate getDateIntervention() {
        return dateIntervention;
    }

    public void setDateIntervention(LocalDate dateIntervention) {
        this.dateIntervention = dateIntervention;
    }

    public Integer getNombreJour() {
        return nombreJour;
    }

    public void setNombreJour(Integer nombreJour) {
        this.nombreJour = nombreJour;
    }

    public Client getIdClient() {
        return idClient;
    }

    public void setIdClient(Client idClient) {
        this.idClient = idClient;
    }

}