package org.example.tptodolistspringsecurity.model;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "todo")
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_todo")
    private Long id;

    private String title;

    private String description;

    private Status status;

    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
