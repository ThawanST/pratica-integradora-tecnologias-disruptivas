package br.com.ThawanAtividade14.pratica_integradora_tecnologias_disruptivas.Reposoitory;

import br.com.ThawanAtividade14.pratica_integradora_tecnologias_disruptivas.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface TarefaRepository extends JpaRepository<Tarefa, Long> {
    List<Tarefa> findByStatus(String status);
}
