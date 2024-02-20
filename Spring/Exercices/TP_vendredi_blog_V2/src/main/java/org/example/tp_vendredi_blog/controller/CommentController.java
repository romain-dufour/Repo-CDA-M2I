package org.example.tp_vendredi_blog.controller;

import org.example.tp_vendredi_blog.dto.CommentDTO;
import org.example.tp_vendredi_blog.mapper.CommentMapper;
import org.example.tp_vendredi_blog.model.Comment;
import org.example.tp_vendredi_blog.service.ICommentService;
import org.example.tp_vendredi_blog.service.IPostService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class CommentController {

    private final ICommentService commentService;
    private final IPostService postService;

    public CommentController(ICommentService commentService, IPostService postService) {
        this.commentService = commentService;
        this.postService= postService;
    }



    @GetMapping("/commentForm") // http://localhost:8080/commentForm
    public String formAddComment(Model model,@RequestParam("postId") int postId){
//        CommentDTO commentDTO = CommentDTO.builder().postDTO(postService.getPostById(postId)).build();
//        model.addAttribute("commentDTO", commentDTO);
        System.out.println(postService.getPostById(postId));
        return "commentForm";
    }
    @PostMapping("/comment") // http://localhost:8080/comment
    public String addComment(@ModelAttribute("commentDTO") CommentDTO commentDTO, Model model){
        commentService.createComment(commentDTO);
//        model.addAttribute("id", commentDTO.getPostDTO().getId());
//        int test =commentDTO.getPostDTO().getId();
        int test =1;
        return "redirect:/" + test;
    }

    @GetMapping("/delete") // http://localhost:8080/delete
    public String delete(@RequestParam("commentId") int id){
        commentService.deleteComment(commentService.getCommentById(id));
        return "redirect:/postDetails";
    }



}
