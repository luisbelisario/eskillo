package com.eskillo.eskillo.controller;

import java.util.List;

import com.eskillo.eskillo.model.TipoFormacao;
import com.eskillo.eskillo.services.TipoFormacaoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TipoFormacaoController {
    
    @Autowired
    private TipoFormacaoService service;

    @GetMapping("/tipos-formacao")
    public List<TipoFormacao> lista() {
        return service.lista();
    }

    @GetMapping("/tipos-formacao/{id}")
    public TipoFormacao getTipoFormacao(@PathVariable Long id) {
        return null;
    }

    @PostMapping("/tipos-formacao")
    public String postTipoFormacao(@RequestBody TipoFormacao tipoFormacao) {
        service.adiciona(tipoFormacao);
        return "Registro adicionada com sucesso!";
    }

    @PutMapping("/tipos-formacao")
    public String putTipoFormacao(@RequestBody TipoFormacao tipoFormacao) {
        //repo.atualiza(localidade);
        return "Registro alterada com sucesso!";
    }

    @DeleteMapping("/tipos-formacao")
    public String deleteTipoFormacao(@RequestBody TipoFormacao tipoFormacao) {
        //repo.remove(localidade);
        return "Registro deletada com sucesso!";
    }
}
