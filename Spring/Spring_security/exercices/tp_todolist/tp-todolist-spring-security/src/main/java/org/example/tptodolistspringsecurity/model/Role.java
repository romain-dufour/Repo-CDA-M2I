package org.example.tptodolistspringsecurity.model;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

@Entity
@Table(name = "role")
@Data
@Builder
public class Role {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String roleType;



    @OneToOne
    @JoinColumn(name="user_id", referencedColumnName = "id_user")
    private User user;


    public Role(String roleType) {
        this.roleType = roleType;
    }

    public Role() {

    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
