package br.com.matriculas.demo.repository;

import br.com.matriculas.demo.entity.Presenca;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PresencaRepository extends JpaRepository <Presenca, Long> {
}
