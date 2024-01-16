package entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "contient")
public class Contient {
    @EmbeddedId
    private ContientId id;

    public ContientId getId() {
        return id;
    }

    public void setId(ContientId id) {
        this.id = id;
    }

    //TODO [JPA Buddy] generate columns from DB
}