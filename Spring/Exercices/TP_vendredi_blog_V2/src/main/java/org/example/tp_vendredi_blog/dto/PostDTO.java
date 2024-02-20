package org.example.tp_vendredi_blog.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.tp_vendredi_blog.model.Comment;

import java.util.List;

@Entity
@Table(name = "postDTO")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String sujet;
    private String contenu;

    @OneToMany(mappedBy = "post")
    private List<Comment> commentList;
}
