package br.com.matriculas.demo.repository;

import br.com.matriculas.demo.entity.Plano;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlanoRepository extends JpaRepository <Plano, Long> {
}
