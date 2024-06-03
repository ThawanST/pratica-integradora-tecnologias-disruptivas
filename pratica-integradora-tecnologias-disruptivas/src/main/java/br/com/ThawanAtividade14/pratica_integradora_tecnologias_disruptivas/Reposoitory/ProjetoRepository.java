package br.com.ThawanAtividade14.pratica_integradora_tecnologias_disruptivas.Reposoitory;

import br.com.ThawanAtividade14.pratica_integradora_tecnologias_disruptivas.Projeto;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ProjetoRepository extends JpaRepository<Projeto, Long> {
    List<Projeto> findByDescricao(String descricao);
}
