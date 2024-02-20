package org.example.tp_vendredi_blog.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.tp_vendredi_blog.model.Comment;

import java.util.List;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PostDTO {

    private int id;
    private String title;

    private String description;

    private String content;

    @OneToMany(mappedBy = "post")
    private List<Comment> commentList;


}
