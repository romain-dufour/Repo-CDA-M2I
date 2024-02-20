package org.example.tp_vendredi_blog.dao;

import org.example.tp_vendredi_blog.dto.CommentDTO;
import org.example.tp_vendredi_blog.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CommentRepository extends JpaRepository<Comment,Integer> {

}
