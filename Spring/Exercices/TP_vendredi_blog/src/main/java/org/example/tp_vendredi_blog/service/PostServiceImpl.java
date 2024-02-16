package org.example.tp_vendredi_blog.service;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.example.tp_vendredi_blog.model.Comment;
import org.example.tp_vendredi_blog.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class PostServiceImpl implements IPostService{
    private List<Post> postList = new ArrayList<>();
    private Long currentPostId = 1L;
    @Override
    public Post createPost(Post post) {
        post.setId(currentPostId++);
        postList.add(post);
        return post;
    }

    @Override
    public Post getPostById(Long id) {
        return postList.stream().filter(post -> post.getId().equals(id)).findFirst().orElse(null);
    }

    @Override
    public List<Post> getAllPost() {
        return postList;
    }

    @Override
    public Post updatePost(Long id, Post updatePost) {
        Post existingPost = getPostById(id);
        if (existingPost != null){
            existingPost.setName(updatePost.getName());
            existingPost.setEmail(updatePost.getEmail());
            existingPost.setContent(updatePost.getContent());
            existingPost.setCommentList(updatePost.getCommentList());
        }
        return existingPost;
    }
}
