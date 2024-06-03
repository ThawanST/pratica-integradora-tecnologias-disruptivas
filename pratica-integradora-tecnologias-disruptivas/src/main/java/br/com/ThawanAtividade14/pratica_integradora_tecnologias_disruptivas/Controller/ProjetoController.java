package br.com.ThawanAtividade14.pratica_integradora_tecnologias_disruptivas.Controller;

import br.com.ThawanAtividade14.pratica_integradora_tecnologias_disruptivas.Projeto;
import br.com.ThawanAtividade14.pratica_integradora_tecnologias_disruptivas.Service.ProjetoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProjetoController {
    @Autowired
    private ProjetoService projetoService;

    @GetMapping("/projetos")
    public List<Projeto> buscarPorDescricao(@RequestParam String descricao) {
        return projetoService.buscarPorDescricao(descricao);
    }
}
