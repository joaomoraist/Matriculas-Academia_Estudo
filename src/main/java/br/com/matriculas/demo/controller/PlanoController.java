package br.com.matriculas.demo.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;

import br.com.matriculas.demo.entity.Plano;
import br.com.matriculas.demo.repository.PlanoRepository;

@RestController
@RequestMapping ("/planos")
public class PlanoController {

    private final PlanoRepository repository;

    public PlanoController (PlanoRepository repository){
        this.repository = repository;
    }


    @PostMapping
    public Plano salvar (@RequestBody Plano plano) {
        return repository.save(plano);
    }

    @GetMapping
    public List<Plano> listar() {
        return repository.findAll();
    }
}