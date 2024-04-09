package com.cybersource.example.web;

import lombok.SneakyThrows;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("bootstrapVersion")
public class HomeController {
    private static final String BOOTSTRAP_VERSION = "https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css";

    @GetMapping("/")
    @SneakyThrows
    public String index(final Model model) {
        model.addAttribute("bootstrapVersion", BOOTSTRAP_VERSION);
        return "index";
    }
}
