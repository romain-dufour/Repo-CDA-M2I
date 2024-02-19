package org.example.tp_vendredi_blog.service;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.example.tp_vendredi_blog.dao.PostRepository;
import org.example.tp_vendredi_blog.model.Comment;
import org.example.tp_vendredi_blog.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PostServiceImpl implements IPostService{
    private PostRepository postRepository;

    public PostServiceImpl (PostRepository postRepository){this.postRepository = postRepository;}

    @Override
    public Post createPost(Post post) {
        return postRepository.save(post);
    }

    @Override
    public Post getPostById(int id) {
        Optional<Post> result = postRepository.findById(id);
        return result.orElse(null);    }

    @Override
    public List<Post> getAllPost() {
        return postRepository.findAll();
    }

    @Override
    public Post updatePost(Post updatePost) {
        return postRepository.save(updatePost);
    }

    public void addComment(Comment comment, int id){
        Post existingPost = getPostById(id);
        existingPost.getCommentList().add(comment);
    }
}
