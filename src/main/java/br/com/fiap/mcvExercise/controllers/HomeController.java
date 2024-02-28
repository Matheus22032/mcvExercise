package br.com.fiap.mcvExercise.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("msg", "Bem-vindo(a) à FIAP Developers");
        return "index";
    }
}
