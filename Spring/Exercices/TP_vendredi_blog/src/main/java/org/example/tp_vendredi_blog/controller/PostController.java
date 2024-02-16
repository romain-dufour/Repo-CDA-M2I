package org.example.tp_vendredi_blog.controller;

import jakarta.validation.Valid;
import org.example.tp_vendredi_blog.model.Post;
import org.example.tp_vendredi_blog.service.IPostService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
public class PostController {

    private final IPostService postService;

    public PostController(IPostService postService){this.postService = postService;}

    //  @GetMapping  // http://localhost:8080
    // public String home(){
    //    return "home";
    // }

    @GetMapping // http://localhost:8080
    public String showAllPost(Model model){
        model.addAttribute("posts",postService.getAllPost());
        return "home";
    }

    @GetMapping("/postForm") // http://localhost:8080/postForm
    public String formAddPost(Model model){
        model.addAttribute("post",new Post());

        return "postForm";
    }

    @GetMapping("/{id}")  // http://localhost:8080/x
    public String showStudent(@PathVariable Long id, Model model){
        model.addAttribute("post",postService.getPostById(id));
        return "postDetails";
    }


    @PostMapping("/post")
    public String addPost(@ModelAttribute("post") Post post){
//si l'id du post n'est pas null on renvoie vers une méthode update
//le formulaire doit proposer une modification -> a prendre en compte dans sa realisation
        if(post.getId() != null){
            postService.updatePost(post.getId(),post);
        } else {
            postService.createPost(post);
        }
        return "redirect:/";
    }

    @GetMapping("/update")
    public String formUpdatePost(@RequestParam("postId") Long id,Model model){
        Post post = postService.getPostById(id);
        model.addAttribute("post",post);
        return "postForm";
    }


}
