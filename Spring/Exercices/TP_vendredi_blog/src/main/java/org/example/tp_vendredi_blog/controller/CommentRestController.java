package org.example.tp_vendredi_blog.controller;

import lombok.AllArgsConstructor;
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

    private final ICommentService commentService;

    @GetMapping("/commentList") // http://localhost:8080/api/v1/postList
    public List<Comment> getAllComments(){
        return commentService.getAllComment();
    }

    @GetMapping("/comment/{id}") // // http://localhost:8080/api/v1/comment/x
    public Comment getCommentByID(@PathVariable("id") Long id){

        return commentService.getCommentById(id);
    }

    @PostMapping("/addComment")  // http://localhost:8080/api/v1/addComment
    public Comment createComment(@RequestBody Comment comment){
        return commentService.createComment(comment);
    }

    @DeleteMapping("/comment/{id}") // http://localhost:8080/api/v1/comment/x
    public void deleteComment(@PathVariable Long id){
        commentService.deleteComment(id);
    }



}
