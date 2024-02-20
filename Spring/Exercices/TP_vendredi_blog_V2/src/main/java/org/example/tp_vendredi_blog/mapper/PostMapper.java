package org.example.tp_vendredi_blog.mapper;

import org.example.tp_vendredi_blog.dto.PostDTO;
import org.example.tp_vendredi_blog.model.Post;
import org.springframework.stereotype.Component;

@Component
public class PostMapper {


    public PostDTO postToPostDTO(Post post){
        return new PostDTO(post.getId(), post.getTitle(), post.getDescription(), post.getContent(), post.getCommentList());
    };


    public Post postDtoToPost(PostDTO postDTO){
        return new Post(postDTO.getId(), postDTO.getTitle(), postDTO.getDescription(), postDTO.getContent(), postDTO.getCommentList());
    };


}
