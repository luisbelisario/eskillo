package com.eskillo.eskillo.controller;

import java.util.List;

import com.eskillo.eskillo.model.BaseDeDadosLocalidade;
import com.eskillo.eskillo.model.Localidade;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LocalidadeController {

    BaseDeDadosLocalidade bd = new BaseDeDadosLocalidade();

    @PostMapping(value="/novalocalidade")
    public String criarLocalidade(@RequestBody Localidade localidade) {
        bd.adicionarLocalidade(localidade);
        return "Novo local adicionado com sucesso!";
    }

    @GetMapping(value="/localidades")
    public List<Localidade> getLocalidades() {
        return bd.mostrarLocalidades();
    }

    @GetMapping(value="/localidade/{id}")
    public Localidade mostraLocalidade(@PathVariable Long id) {
         return bd.mostrarLocalidade(id);   
    }

    @DeleteMapping(value="/dellocalidade/{id}")
    public String deletaLocalidade(@RequestBody Long id) {
        bd.removerLocalidade(id);
        return "Local removido com sucesso!";
   }
}
