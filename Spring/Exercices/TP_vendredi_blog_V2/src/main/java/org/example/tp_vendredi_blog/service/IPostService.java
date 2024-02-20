package org.example.tp_vendredi_blog.service;

import org.example.tp_vendredi_blog.dto.PostDTO;
import org.example.tp_vendredi_blog.model.Comment;
import org.example.tp_vendredi_blog.model.Post;

import java.util.List;

public interface IPostService {


    PostDTO createPost(PostDTO postDTO);

    PostDTO getPostById(int id);

    List<PostDTO> getAllPost();

    PostDTO updatePostDTO(PostDTO updatePostDTO);


}
