package org.example.tp_vendredi_blog.mapper;

import org.example.tp_vendredi_blog.dto.PostDTO;
import org.example.tp_vendredi_blog.model.Post;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PostMapper {


    @Mapping(source = "content", target = "contenu")
    @Mapping(source = "description", target = "sujet")
    PostDTO postToPostDTO(Post post);


    @Mapping(source = "contenu", target = "content")
    @Mapping(source = "sujet", target = "description")
    Post postDtoToPost(PostDTO postDTO);


}
