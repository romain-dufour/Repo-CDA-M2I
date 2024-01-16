package entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class CorrespondId implements Serializable {
    private static final long serialVersionUID = 6828816465963339431L;
    @Column(name = "id_employe", nullable = false)
    private Integer idEmploye;

    @Column(name = "Type_qualification", nullable = false)
    private Integer typeQualification;

    public Integer getIdEmploye() {
        return idEmploye;
    }

    public void setIdEmploye(Integer idEmploye) {
        this.idEmploye = idEmploye;
    }

    public Integer getTypeQualification() {
        return typeQualification;
    }

    public void setTypeQualification(Integer typeQualification) {
        this.typeQualification = typeQualification;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        CorrespondId entity = (CorrespondId) o;
        return Objects.equals(this.typeQualification, entity.typeQualification) &&
                Objects.equals(this.idEmploye, entity.idEmploye);
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeQualification, idEmploye);
    }

}