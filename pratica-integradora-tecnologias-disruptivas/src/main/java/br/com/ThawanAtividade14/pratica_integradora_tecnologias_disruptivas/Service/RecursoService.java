package br.com.ThawanAtividade14.pratica_integradora_tecnologias_disruptivas.Service;

import br.com.ThawanAtividade14.pratica_integradora_tecnologias_disruptivas.Recurso;
import br.com.ThawanAtividade14.pratica_integradora_tecnologias_disruptivas.Reposoitory.RecursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecursoService {
    @Autowired
    private RecursoRepository recursoRepository;

    public List<Recurso> buscarPorNome(String nome) {
        return recursoRepository.findByNome(nome);
    }
}
