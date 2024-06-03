package br.com.ThawanAtividade14.pratica_integradora_tecnologias_disruptivas.Reposoitory;

import br.com.ThawanAtividade14.pratica_integradora_tecnologias_disruptivas.Recurso;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface RecursoRepository extends JpaRepository<Recurso, Long> {
    List<Recurso> findByNome(String nome);
}
