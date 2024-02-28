package br.com.fiap.mcvExercise.repository;

import br.com.fiap.mcvExercise.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}
