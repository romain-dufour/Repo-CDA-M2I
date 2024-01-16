package entity;

import jakarta.persistence.*;

@Entity
@Table(name = "qualification")
public class Qualification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Type_qualification", nullable = false)
    private Integer id;

    @Column(name = "Nom_qualif", nullable = false, length = 250)
    private String nomQualif;

    @Column(name = "tarif_qualif", nullable = false)
    private Float tarifQualif;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomQualif() {
        return nomQualif;
    }

    public void setNomQualif(String nomQualif) {
        this.nomQualif = nomQualif;
    }

    public Float getTarifQualif() {
        return tarifQualif;
    }

    public void setTarifQualif(Float tarifQualif) {
        this.tarifQualif = tarifQualif;
    }

}