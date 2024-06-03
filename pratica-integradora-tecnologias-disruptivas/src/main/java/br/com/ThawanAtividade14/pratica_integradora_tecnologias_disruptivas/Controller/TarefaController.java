package br.com.ThawanAtividade14.pratica_integradora_tecnologias_disruptivas.Controller;

import br.com.ThawanAtividade14.pratica_integradora_tecnologias_disruptivas.Service.TarefaService;
import br.com.ThawanAtividade14.pratica_integradora_tecnologias_disruptivas.Tarefa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TarefaController {
    @Autowired
    private TarefaService tarefaService;

    @GetMapping("/tarefas")
    public List<Tarefa> buscarPorStatus(@RequestParam String status) {
        return tarefaService.buscarPorStatus(status);
    }
}
