package org.example.tp_vendredi_blog.mapper;

import org.example.tp_vendredi_blog.dto.CommentDTO;
import org.example.tp_vendredi_blog.model.Comment;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")

public interface CommentMapper {


    @Mapping(source = "name", target = "commentateur")
    CommentDTO commentToCommentDTO(Comment comment);

    @Mapping(source = "commentateur", target = "name")
    Comment commentDtoToComment(CommentDTO commentDTO);

}
