package org.example.tp_vendredi_blog.service;

import org.example.tp_vendredi_blog.dto.CommentDTO;
import org.example.tp_vendredi_blog.model.Comment;

import java.util.List;

public interface ICommentService {

    CommentDTO createComment(CommentDTO commentDTO);

    CommentDTO getCommentById(int id);

    List<CommentDTO> getAllComment();

    CommentDTO updateComment(CommentDTO updateCommentDTO);

    void deleteComment(CommentDTO commentDTO);
}
