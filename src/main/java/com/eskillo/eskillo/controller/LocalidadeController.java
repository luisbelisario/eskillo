package com.eskillo.eskillo.controller;

import java.util.ArrayList;
import java.util.List;
import com.eskillo.eskillo.model.Localidade;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class LocalidadeController {
    
    static List<Localidade> listaLocalidades = new ArrayList<Localidade>();

    @PostMapping(value="/novalocalidade")
    public String criarLocalidade(@RequestBody Localidade localidade) {
        listaLocalidades.add(localidade);
        return "Novo local adicionado com sucesso!";
    }

    @GetMapping(value="/localidades")
    public List<Localidade> getLocalidades() {
        return listaLocalidades;
    }
    
}
