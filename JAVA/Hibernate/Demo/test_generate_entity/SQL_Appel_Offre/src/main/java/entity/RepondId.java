package entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class RepondId implements Serializable {
    private static final long serialVersionUID = -6291263720466696874L;
    @Column(name = "numero_offre", nullable = false)
    private Integer numeroOffre;

    @Column(name = "Numero_fournisseur", nullable = false)
    private Integer numeroFournisseur;

    public Integer getNumeroOffre() {
        return numeroOffre;
    }

    public void setNumeroOffre(Integer numeroOffre) {
        this.numeroOffre = numeroOffre;
    }

    public Integer getNumeroFournisseur() {
        return numeroFournisseur;
    }

    public void setNumeroFournisseur(Integer numeroFournisseur) {
        this.numeroFournisseur = numeroFournisseur;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        RepondId entity = (RepondId) o;
        return Objects.equals(this.numeroFournisseur, entity.numeroFournisseur) &&
                Objects.equals(this.numeroOffre, entity.numeroOffre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numeroFournisseur, numeroOffre);
    }

}