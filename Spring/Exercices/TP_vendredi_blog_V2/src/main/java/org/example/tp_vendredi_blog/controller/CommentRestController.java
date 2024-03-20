package org.example.tp_vendredi_blog.controller;

import lombok.AllArgsConstructor;
import org.example.tp_vendredi_blog.dto.CommentDTO;
import org.example.tp_vendredi_blog.model.Comment;
import org.example.tp_vendredi_blog.model.Post;
import org.example.tp_vendredi_blog.service.ICommentService;
import org.example.tp_vendredi_blog.service.IPostService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1")
public class CommentRestController {

    private ICommentService commentService;

    @GetMapping("/commentList") // http://localhost:8080/api/v1/commentList   localhost:3306/tp_spring_blog//api/v1/commentList
    public List<CommentDTO> getAllComments() {
        return commentService.getAllComment();
    }

    @GetMapping("/comment/{id}") // // http://localhost:8080/api/v1/comment/x
    public CommentDTO getCommentByID(@PathVariable("id") int id) {

        return commentService.getCommentById(id);
    }

    @PostMapping("/addComment")  // http://localhost:8080/api/v1/addComment
    public CommentDTO createComment(@RequestBody CommentDTO commentDTO) {
        return commentService.createComment(commentDTO);
    }

    @DeleteMapping("/comment/{id}") // http://localhost:8080/api/v1/comment/x
    public void deleteComment(@PathVariable int id) {
        commentService.deleteComment(commentService.getCommentById(id));
    }

}