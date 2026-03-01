package br.com.matriculas.demo.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;

import br.com.matriculas.demo.entity.Aluno;
import br.com.matriculas.demo.repository.AlunoRepository;

@RestController
@RequestMapping ("/alunos")
public class AlunoController {

    private final AlunoRepository repository;

    public AlunoController(AlunoRepository repository){
        this.repository = repository;
    }

    @PostMapping
    public Aluno salvar (@RequestBody Aluno aluno) {
        return repository.save(aluno);
    }

    @GetMapping
    public List<Aluno> listar() {
        return repository.findAll();
    }
}
