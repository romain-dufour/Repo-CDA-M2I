package com.example.demo_upload_session.controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;

@Controller
@ResponseBody
@RequestMapping("http-session")
public class SessionController {

    @Autowired
    private HttpSession _httpSession;

    @GetMapping("/ecrire")
    public String write(){

        _httpSession.setAttribute("name","toto");
        return "ecrit";
    }

    @GetMapping("/ecrire-list")
    public String writeList(){
        List<String> stringList = Arrays.asList("titi","tutu","toto");
        _httpSession.setAttribute("list",stringList);
        return "liste ecrite";
    }
    @GetMapping("/lire")
    public String read(){
        return _httpSession.getAttribute("name").toString();
    }

    @GetMapping("/lire-list")
    public List<String> readlist(){
        return (List<String>) _httpSession.getAttribute("list");


    }


    @GetMapping("supprimer")
    public String remove(){
        _httpSession.removeAttribute("name");
        return "Suppression attribut name ok !!";
    }
}

