package org.example.tptodolistspringsecurity.controller;

import org.example.tptodolistspringsecurity.dto.BaseResponceDto;
import org.example.tptodolistspringsecurity.dto.UserLoginDto;
import org.example.tptodolistspringsecurity.dto.UserRegisterDto;
import org.example.tptodolistspringsecurity.model.Role;
import org.example.tptodolistspringsecurity.model.RoleType;
import org.example.tptodolistspringsecurity.model.User;
import org.example.tptodolistspringsecurity.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/api/auth/register")
    public BaseResponceDto registerUser(@RequestBody UserRegisterDto newUserDto){
        User newUser = User.builder()
                .name(newUserDto.getName())
                .email(newUserDto.getEmail())
                .passwords(newUserDto.getPassword())
                .roles(Role.builder().roleType("USER").build()) // Par défaut, attribuez le rôle USER à un nouvel utilisateur
                .isEnabled(true) // Par défaut, activez le nouvel utilisateur
                .build();        System.out.println(newUser);
        if(userService.createUser(newUser)){
            return new BaseResponceDto("success");
        }else {
            return new BaseResponceDto("failed");
        }
    }

    @PostMapping("/api/auth/login")
    public BaseResponceDto loginUser(@RequestBody UserLoginDto loginDetails){
        if(userService.checkUserNameExists(loginDetails.getEmail())){
            if(userService.verifyUser(loginDetails.getEmail(), loginDetails.getPassword())){
                Map<String, Object> data = new HashMap<>();
                data.put("token", userService.generateToken(loginDetails.getEmail(), loginDetails.getPassword()));
                return new BaseResponceDto("success", data );
            }else {
                return new BaseResponceDto("wrong password");
            }
        }else {
            return new BaseResponceDto("user not exist");
        }
    }


}
