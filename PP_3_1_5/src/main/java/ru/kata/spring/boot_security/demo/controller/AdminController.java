package ru.kata.spring.boot_security.demo.controller;


import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.kata.spring.boot_security.demo.model.User;
@Controller
@RequestMapping("/admin")
public class AdminController {

    @GetMapping
    public String findAll(Model model, @AuthenticationPrincipal User user) {
        model.addAttribute("user", user);
        return "admin";
    }
}
