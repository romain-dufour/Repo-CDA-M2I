package org.example.tp_vendredi_blog.service;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.example.tp_vendredi_blog.dao.PostRepository;
import org.example.tp_vendredi_blog.dto.CommentDTO;
import org.example.tp_vendredi_blog.dto.PostDTO;
import org.example.tp_vendredi_blog.mapper.PostMapper;
import org.example.tp_vendredi_blog.model.Comment;
import org.example.tp_vendredi_blog.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PostServiceImpl implements IPostService{
    private PostRepository postRepository;
    private PostMapper postMapper;

    public PostServiceImpl (PostRepository postRepository,PostMapper postMapper){
        this.postRepository = postRepository;
        this.postMapper = postMapper;
    }

    @Override
    public PostDTO createPost(PostDTO postDTO) {
        return postMapper.postToPostDTO(postRepository.save(postMapper.postDtoToPost(postDTO)));
    }

    @Override
    public PostDTO getPostById(int id) {
//        Optional<PostDTO> result = postRepository.findById(id);
//        return result.orElse(null);    }
        return null;   }

    @Override
    public List<PostDTO> getAllPost() {
        return postRepository.findAll()
                .stream()
                .map(postMapper::postToPostDTO)
                .toList();
    }

    @Override
    public PostDTO updatePostDTO(PostDTO updatePostDTO) {
        return postMapper.postToPostDTO(postRepository.save(postMapper.postDtoToPost(updatePostDTO)));
    }

    public void addComment(Comment comment, int id){
        PostDTO existingPostDTO = getPostById(id);
        existingPostDTO.getCommentList().add(comment);
    }
}
