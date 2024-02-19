package org.example.tp_vendredi_blog.service;

import org.example.tp_vendredi_blog.model.Comment;

import java.util.List;

public interface ICommentService {

    Comment createComment(Comment comment);

    Comment getCommentById(int id);

    List<Comment> getAllComment();

    Comment updateComment(Comment updateComment);

    void deleteComment(Comment comment);
}
