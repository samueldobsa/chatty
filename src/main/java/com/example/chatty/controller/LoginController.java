package com.example.chatty.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @GetMapping("/")
    public String login(){
        return "login";
    }

    @GetMapping("/chat")
    public String chat(@RequestParam String username, Model model){
        model.addAttribute("username", username);
        return "chat";
    }

}
