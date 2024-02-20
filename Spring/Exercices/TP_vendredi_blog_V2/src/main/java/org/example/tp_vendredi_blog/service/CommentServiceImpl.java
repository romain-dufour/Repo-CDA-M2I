package org.example.tp_vendredi_blog.service;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.example.tp_vendredi_blog.dao.CommentRepository;
import org.example.tp_vendredi_blog.dto.CommentDTO;
import org.example.tp_vendredi_blog.mapper.CommentMapper;
import org.example.tp_vendredi_blog.mapper.PostMapper;
import org.example.tp_vendredi_blog.model.Comment;
import org.example.tp_vendredi_blog.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CommentServiceImpl implements ICommentService{

    private CommentRepository commentRepository;
    private CommentMapper commentMapper;

    public CommentServiceImpl(CommentRepository commentRepository,CommentMapper commentMapper){
        this.commentRepository = commentRepository;
        this.commentMapper = commentMapper;
    }
    @Override
    public CommentDTO createComment(CommentDTO commentDTO) {

        return commentMapper.commentToCommentDTO(commentRepository.save(commentMapper.commentDtoToComment(commentDTO)));
//        return commentRepository.save(commentDTO);
    }

    @Override
    public CommentDTO getCommentById(int id) {
        Optional<CommentDTO> result = commentRepository.findById(id);
        return result.orElse(null);
    }

    @Override
    public List<CommentDTO> getAllComment() {
        return commentRepository.findAll();
    }

    @Override
    public CommentDTO updateComment(CommentDTO updateComment) {
        return commentRepository.save(updateComment);
    }

    @Override
    public void deleteComment(CommentDTO commentDTO) {
//        Comment result = commentRepository.findByIdIs(id);
        commentRepository.delete(commentDTO);
    }

//    public void addComment(Comment comment, Long id){
//        Post existingPost = ;
//        existingPost.getCommentList().add(comment);
//    }

}
