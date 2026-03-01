package br.com.matriculas.demo.entity;

import jakarta.persistence.*;
import org.springframework.aot.generate.GeneratedTypeReference;

import java.util.List;

@Entity
@Table (name = "tb_plano")
public class Plano {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private Double valor;

    private Integer duracaoMeses;

    @OneToMany(mappedBy = "plano")
    private List<Matricula> matriculas;



}
