package br.com.ThawanAtividade14.pratica_integradora_tecnologias_disruptivas.Service;

import br.com.ThawanAtividade14.pratica_integradora_tecnologias_disruptivas.Projeto;
import br.com.ThawanAtividade14.pratica_integradora_tecnologias_disruptivas.Reposoitory.ProjetoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjetoService {
    @Autowired
    private ProjetoRepository projetoRepository;

    public List<Projeto> buscarPorDescricao(String descricao) {
        return projetoRepository.findByDescricao(descricao);
    }
}
