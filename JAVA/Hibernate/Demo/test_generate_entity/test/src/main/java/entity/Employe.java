package entity;

import jakarta.persistence.*;

@Entity
@Table(name = "employe")
public class Employe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_employe", nullable = false)
    private Integer id;

    @Column(name = "qualif_base", nullable = false, length = 50)
    private String qualifBase;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getQualifBase() {
        return qualifBase;
    }

    public void setQualifBase(String qualifBase) {
        this.qualifBase = qualifBase;
    }

}