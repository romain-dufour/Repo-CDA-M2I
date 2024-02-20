package com.example.exercice_session.controller;

import com.example.exercice_session.service.AppliService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
//@RequestMapping("")
public class AppliController {

    private final AppliService appliService;
    private final HttpSession _httpSession;
    @Autowired
    public AppliController(AppliService appliService, HttpSession _httpSession) {
        this.appliService = appliService;
        this._httpSession = _httpSession;
    }


//    @GetMapping("/login")
//    public String checkLogin(){
//        _httpSession.getAttribute("identifiant");
//        _httpSession.getAttribute("password");
//        return "login";
//    }

    @GetMapping("/login")
    public String getLogin() {
        return "login";
    }



    @PostMapping("/login")
    public String login(@RequestParam String user,
                        @RequestParam String password) {
        if (appliService.login(user, password)) {
            return "protectedpage";
        } else {
//            model.addAttribute("error", "Identifiant ou mot de passe incorrect");
            return "login";
        }
    }


    @GetMapping("/protected")
    public String protectedPage() {
        // Vérifiez si l'utilisateur est authentifié (session existante)
        if (appliService.islogged()) {
            return "protectedpage";
        }
        return "redirect:/login";
    }


//    @GetMapping("/login")
//    public String protectedPage(@RequestParam("identifiant") String identifiant, @RequestParam("password")String password){
//        if (appliService.isLogged(identifiant,password)){
//            return "/protectedpage";
//        }
//        return "login";
//    }

}
