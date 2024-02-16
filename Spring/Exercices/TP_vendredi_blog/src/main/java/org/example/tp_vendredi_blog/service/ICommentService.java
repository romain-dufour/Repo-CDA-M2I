package org.example.tp_vendredi_blog.service;

import org.example.tp_vendredi_blog.model.Comment;

import java.util.List;

public interface ICommentService {

    Comment createComment(Comment comment);

    Comment getCommentById(Long id);

    List<Comment> getAllComment();

    Comment updateComment(Long id, Comment updateComment);

    void deleteComment(Long id);
}
