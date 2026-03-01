package br.com.matriculas.demo.repository;

import br.com.matriculas.demo.entity.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository <Aluno, Long> {
}
