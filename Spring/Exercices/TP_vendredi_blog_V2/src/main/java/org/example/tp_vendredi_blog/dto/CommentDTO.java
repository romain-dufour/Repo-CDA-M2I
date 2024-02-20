package org.example.tp_vendredi_blog.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.tp_vendredi_blog.model.Post;
@Entity
@Table(name = "commentDTO")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommentDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String commentateur;
    private String email;
    private String content;
    @ManyToOne
    @JoinColumn(name = "post_id")
    private Post post;
}
