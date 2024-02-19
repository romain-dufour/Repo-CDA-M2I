package org.example.tp_vendredi_blog.service;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.example.tp_vendredi_blog.dao.CommentRepository;
import org.example.tp_vendredi_blog.model.Comment;
import org.example.tp_vendredi_blog.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CommentServiceImpl implements ICommentService{

    private CommentRepository commentRepository;

    public CommentServiceImpl(CommentRepository commentRepository){this.commentRepository = commentRepository;}
    @Override
    public Comment createComment(Comment comment) {
    return commentRepository.save(comment);
    }

    @Override
    public Comment getCommentById(int id) {
        Optional<Comment> result = commentRepository.findById(id);
        return result.orElse(null);
    }

    @Override
    public List<Comment> getAllComment() {
        return commentRepository.findAll();
    }

    @Override
    public Comment updateComment(Comment updateComment) {
        return commentRepository.save(updateComment);
    }

    @Override
    public void deleteComment(Comment comment) {
//        Comment result = commentRepository.findByIdIs(id);
        commentRepository.delete(comment);
    }

//    public void addComment(Comment comment, Long id){
//        Post existingPost = ;
//        existingPost.getCommentList().add(comment);
//    }
    
}
