package br.com.matriculas.demo.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;

import br.com.matriculas.demo.entity.Presenca;
import br.com.matriculas.demo.repository.PresencaRepository;

@RestController
@RequestMapping("/presencas")
public class PresencaController {

    private final PresencaRepository repository;

    public PresencaController(PresencaRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public Presenca salvar(@RequestBody Presenca presenca) {
        return repository.save(presenca);
    }

    @GetMapping
    public List<Presenca> listar() {
        return repository.findAll();
    }
}