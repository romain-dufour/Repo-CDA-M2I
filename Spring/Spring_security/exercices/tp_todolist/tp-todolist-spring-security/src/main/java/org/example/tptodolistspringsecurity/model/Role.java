package org.example.tptodolistspringsecurity.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "role")
@Data
@Builder
@AllArgsConstructor
public class Role {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String roleType;



    @OneToMany(mappedBy = "roles", cascade = CascadeType.ALL , fetch = FetchType.LAZY) // Par defaut en LAZY
    private List<User> userList;


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
