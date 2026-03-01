package br.com.matriculas.demo.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;

import br.com.matriculas.demo.entity.Matricula;
import br.com.matriculas.demo.repository.MatriculaRepository;

@RestController
@RequestMapping("/matriculas")
public class MatriculaController {

    private final MatriculaRepository repository;

    public MatriculaController(MatriculaRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public Matricula salvar(@RequestBody Matricula matricula) {
        return repository.save(matricula);
    }

    @GetMapping
    public List<Matricula> listar() {
        return repository.findAll();
    }
}