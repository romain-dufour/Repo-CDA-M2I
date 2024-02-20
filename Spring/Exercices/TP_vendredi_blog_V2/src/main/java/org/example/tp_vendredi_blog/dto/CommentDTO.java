package org.example.tp_vendredi_blog.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.tp_vendredi_blog.model.Comment;
import org.example.tp_vendredi_blog.model.Post;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CommentDTO {


    private int id;
    private String name;

    private String email;

    private String content;

    @ManyToOne
    @JoinColumn(name = "post_id")
    private Post post;
}
