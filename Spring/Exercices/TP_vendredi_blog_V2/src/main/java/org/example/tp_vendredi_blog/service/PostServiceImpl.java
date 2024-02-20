package org.example.tp_vendredi_blog.service;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.example.tp_vendredi_blog.dao.PostRepository;
import org.example.tp_vendredi_blog.dto.CommentDTO;
import org.example.tp_vendredi_blog.dto.PostDTO;
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
    public PostDTO createPost(PostDTO postDTO) {
        return postRepository.save(postDTO);
    }

    @Override
    public PostDTO getPostById(int id) {
        Optional<PostDTO> result = postRepository.findById(id);
        return result.orElse(null);    }

    @Override
    public List<PostDTO> getAllPost() {
        return postRepository.findAll();
    }

    @Override
    public PostDTO updatePostDTO(PostDTO updatePostDTO) {
        return postRepository.save(updatePostDTO);
    }

    public void addComment(CommentDTO commentDTO, int id){
        PostDTO existingPostDTO = getPostById(id);
        existingPostDTO.getCommentList().add(commentDTO);
    }
}
