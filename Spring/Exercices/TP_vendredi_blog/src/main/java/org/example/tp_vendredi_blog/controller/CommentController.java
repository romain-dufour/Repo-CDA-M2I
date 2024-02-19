package org.example.tp_vendredi_blog.controller;

import org.example.tp_vendredi_blog.model.Comment;
import org.example.tp_vendredi_blog.service.ICommentService;
import org.example.tp_vendredi_blog.service.IPostService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CommentController {

    private final ICommentService commentService;
    private final IPostService postService;

    public CommentController(ICommentService commentService ,IPostService postService){
        this.commentService = commentService;
        this.postService= postService;
    }


    @GetMapping("/commentForm") // http://localhost:8080/commentForm
    public String formAddComment(Model model){
        model.addAttribute("comment",new Comment());

        return "commentForm";
    }
    @PostMapping("/comment") // http://localhost:8080/comment
    public String addComment(@ModelAttribute("student")Comment comment, @RequestParam("postId") Long id){
        commentService.createComment(comment);
//        postService.
        return "redirect:/postDetails";
    }

    @GetMapping("/delete") // http://localhost:8080/delete
    public String delete(@RequestParam("commentId") Long id){
        commentService.deleteComment(id);
        return "redirect:/postDetails";
    }
}
