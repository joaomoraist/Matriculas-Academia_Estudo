package br.com.matriculas.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "tb_presenca")
public class Presenca {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate data;

    private LocalTime horarioEntrada;

    private LocalTime horarioSaida;

    @ManyToOne
    @JoinColumn(name = "aluno_id")
    private Aluno aluno;

    // getters e setters
}