package com.study.thymeleaf.controller;


import java.time.LocalDateTime;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.study.thymeleaf.dto.UserDTO;

@Controller
public class HomeController {
    @GetMapping({"/", "/index"})
    public String index(HttpSession session, Model model) {
        session.setAttribute("user", new UserDTO("unknown"));
        model.addAttribute("welcome", "welcome my page!");
        model.addAttribute("today", LocalDateTime.now());
        return "index";
    }
}
