package org.example.tp_vendredi_blog.service;

import org.example.tp_vendredi_blog.model.Post;

import java.util.List;

public interface IPostService {


    Post createPost(Post post);

    Post getPostById(Long id);

    List<Post> getAllPost();

    Post updatePost(Long id, Post updatePost);

}
