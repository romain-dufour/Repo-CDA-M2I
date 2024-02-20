package com.example.exercice_session.service;

import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppliService {

    private final String User = "user";
    private final String Password = "password";

    @Autowired
    private HttpSession _httpSession;

    public boolean login(String user, String password){

        if (User.equals(user) && Password.equals(password)){
            _httpSession.setAttribute("login","OK");
            return true;
        } else {
            return false;}
    }

    public boolean islogged(){
        try {
            String attrIsLogged = _httpSession.getAttribute("login").toString();
            return attrIsLogged.equals("OK");
        }catch (Exception ex){
            return false;
        }
    }
}
