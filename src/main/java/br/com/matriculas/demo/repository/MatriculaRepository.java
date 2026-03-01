package br.com.matriculas.demo.repository;

import br.com.matriculas.demo.entity.Matricula;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MatriculaRepository extends JpaRepository <Matricula, Long> {
}
