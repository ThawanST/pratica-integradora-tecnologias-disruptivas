package br.com.ThawanAtividade14.pratica_integradora_tecnologias_disruptivas.Service;

import br.com.ThawanAtividade14.pratica_integradora_tecnologias_disruptivas.Reposoitory.TarefaRepository;
import br.com.ThawanAtividade14.pratica_integradora_tecnologias_disruptivas.Tarefa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TarefaService {
    @Autowired
    private TarefaRepository tarefaRepository;

    public List<Tarefa> buscarPorStatus(String status) {
        return tarefaRepository.findByStatus(status);
    }
}
