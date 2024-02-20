package org.example.tp_vendredi_blog.controller;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.example.tp_vendredi_blog.dto.PostDTO;
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

    private IPostService postService;

    @GetMapping("/postList") // http://localhost:8080/api/v1/postList
    public List<PostDTO> getAllPosts(){
        return postService.getAllPost();
    }

    @GetMapping("/post/{id}") // http://localhost:8080/api/v1/post/x
    public PostDTO getPostByID(@PathVariable("id") int id){
        return postService.getPostById(id);
    }


    @PostMapping("/addPost")  // http://localhost:8080/api/v1/addPost
    public PostDTO createPost(@RequestBody PostDTO postDTO){
        return postService.createPost(postDTO);
    }

    @PutMapping("/updatePost/{id}") // http://localhost:8080/api/v1/post/x
    public PostDTO updatePost(@PathVariable int id,@RequestBody PostDTO updatePostDTO){
        return postService.updatePostDTO(updatePostDTO);
    }







}
