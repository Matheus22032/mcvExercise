package br.com.fiap.mcvExercise.controllers;

import br.com.fiap.mcvExercise.model.Aluno;
import br.com.fiap.mcvExercise.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/alunos")
public class AlunoController {

    @Autowired
    AlunoRepository alunoRepository;

    @GetMapping("/novo")
    public String adicionarAluno(Model model){
        model.addAttribute("aluno", new Aluno());
        return "/aluno/novo-aluno";
    }

    @PostMapping("/salvar")
    public String insertAluno(Aluno aluno){
        alunoRepository.save(aluno);
        System.out.println(aluno);
        return "redirect:/alunos/novo";
    }
}
