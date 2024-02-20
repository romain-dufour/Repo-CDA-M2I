package org.example.tp_vendredi_blog.mapper;

import org.example.tp_vendredi_blog.dto.CommentDTO;
import org.example.tp_vendredi_blog.model.Comment;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;


@Component
public class CommentMapper {


    public CommentDTO commentToCommentDTO(Comment comment){
        return new CommentDTO(comment.getId(),comment.getName(),comment.getEmail(), comment.getContent(), comment.getPost());
    }


    public Comment commentDtoToComment(CommentDTO commentDTO){
        return new Comment(commentDTO.getId(),commentDTO.getName(),commentDTO.getEmail(), commentDTO.getContent(), commentDTO.getPost());
    };

}
