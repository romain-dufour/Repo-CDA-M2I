package org.example.tp_vendredi_blog.controller;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.example.tp_vendredi_blog.model.Post;
import org.example.tp_vendredi_blog.service.IPostService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1")
public class PostRestController {

    private final IPostService postService;

    @GetMapping("/postList") // http://localhost:8080/api/v1/postList
    public List<Post> getAllPosts(){
        return postService.getAllPost();
    }

    @GetMapping("/post/{id}") // http://localhost:8080/api/v1/post/x
    public Post getPostByID(@PathVariable("id") Long id){
        return postService.getPostById(id);
    }


    @PostMapping("/addPost")  // http://localhost:8080/api/v1/addPost
    public Post createPost(@RequestBody Post post){
        return postService.createPost(post);
    }

    @PutMapping("/updatePost/{id}") // http://localhost:8080/api/v1/post/x
    public Post updatePost(@PathVariable Long id,@RequestBody Post updatedPost){
        return postService.updatePost(id,updatedPost);
    }







}
