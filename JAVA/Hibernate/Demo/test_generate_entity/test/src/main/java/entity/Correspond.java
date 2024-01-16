package entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "correspond")
public class Correspond {
    @EmbeddedId
    private CorrespondId id;

    public CorrespondId getId() {
        return id;
    }

    public void setId(CorrespondId id) {
        this.id = id;
    }

    //TODO [JPA Buddy] generate columns from DB
}