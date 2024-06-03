package br.com.ThawanAtividade14.pratica_integradora_tecnologias_disruptivas.Controller;

import br.com.ThawanAtividade14.pratica_integradora_tecnologias_disruptivas.Recurso;
import br.com.ThawanAtividade14.pratica_integradora_tecnologias_disruptivas.Service.RecursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RecursoController {
    @Autowired
    private RecursoService recursoService;

    @GetMapping("/recursos")
    public List<Recurso> buscarPorNome(@RequestParam String nome) {
        return recursoService.buscarPorNome(nome);
    }
}
