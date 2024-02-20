package org.example.tp_vendredi_blog.dao;

import org.example.tp_vendredi_blog.dto.PostDTO;
import org.example.tp_vendredi_blog.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<PostDTO,Integer> {
}
