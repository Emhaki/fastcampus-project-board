package com.fastcampus.projectboard.contoller;

import org.springframework.web.bind.annotation.GetMapping;

public class MainController {

    @GetMapping("/")
    public String root() {
        return "redirect:/articles";
    }
}
