package com.study.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TemplateController {
    
    @GetMapping("/template")
    String template() {
        return "fragments/concat";
    }
    
    @GetMapping("/layoutHello")
    String layoutHello() {
        return "layout/hello";
    }
}
