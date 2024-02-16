package org.example.tp_vendredi_blog.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Comment {
    private Long id;

    private String name;

    private String email;

    private String content;

    private Post post;
}
