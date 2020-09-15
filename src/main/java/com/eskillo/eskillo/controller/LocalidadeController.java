package com.eskillo.eskillo.controller;

import java.util.List;

import com.eskillo.eskillo.model.Localidade;
import com.eskillo.eskillo.repositories.LocalidadeRepository;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LocalidadeController {

    private LocalidadeRepository repo = new LocalidadeRepository();


    @GetMapping("/localidades")
    public List<Localidade> getLocalidades() {
        return repo.obtemLocalidades();
    }

    @GetMapping("/localidades/{id}")
    public Localidade getLocalidade(@PathVariable Long id) {
        return repo.obtemLocalidade(id);
    }

    @PostMapping("/localidades")
    public String postLocalidade(@RequestBody Localidade localidade) {
        repo.adiciona(localidade);
        return "Localidade adicionada com sucesso!";
    }

    @PutMapping("/localidades")
    public String putLocalidade(@RequestBody Localidade localidade) {
        repo.atualiza(localidade);
        return "Localidade alterada com sucesso!";
    }

    @DeleteMapping("/localidades")
    public String deleteLocalidade(@RequestBody Localidade localidade) {
        repo.remove(localidade);
        return "Localidade deletada com sucesso!";
    } 

}
