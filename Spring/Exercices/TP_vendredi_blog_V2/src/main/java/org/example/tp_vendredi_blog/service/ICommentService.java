package org.example.tp_vendredi_blog.service;

import org.example.tp_vendredi_blog.dto.CommentDTO;
import org.example.tp_vendredi_blog.model.Comment;

import java.util.List;

public interface ICommentService {

    Comment createComment(CommentDTO commentDTO);

    Comment getCommentById(int id);

    List<Comment> getAllComment();

    Comment updateComment(CommentDTO updateCommentDTO);

    void deleteComment(CommentDTO commentDTO);
}
