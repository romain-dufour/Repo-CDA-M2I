package entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class ContientId implements Serializable {
    private static final long serialVersionUID = 9079778485336550150L;
    @Column(name = "id_intervention", nullable = false)
    private Integer idIntervention;

    @Column(name = "id_employe", nullable = false)
    private Integer idEmploye;

    public Integer getIdIntervention() {
        return idIntervention;
    }

    public void setIdIntervention(Integer idIntervention) {
        this.idIntervention = idIntervention;
    }

    public Integer getIdEmploye() {
        return idEmploye;
    }

    public void setIdEmploye(Integer idEmploye) {
        this.idEmploye = idEmploye;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        ContientId entity = (ContientId) o;
        return Objects.equals(this.idEmploye, entity.idEmploye) &&
                Objects.equals(this.idIntervention, entity.idIntervention);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idEmploye, idIntervention);
    }

}