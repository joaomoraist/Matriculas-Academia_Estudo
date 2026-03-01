package br.com.matriculas.demo.entity;

import jakarta.persistence.*;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tb_aluno")
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @Column(unique = true)
    private String cpf;

    private String email;

    private Boolean ativo = true;

    @OneToMany(mappedBy = "aluno")
    private List<Matricula> matriculas;

    @OneToMany(mappedBy = "aluno")
    private List<Presenca> presencas;
}
