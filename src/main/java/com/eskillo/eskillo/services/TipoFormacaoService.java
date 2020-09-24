package com.eskillo.eskillo.services;

import java.util.List;

import com.eskillo.eskillo.model.TipoFormacao;
import com.eskillo.eskillo.repositories.TipoFormacaoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TipoFormacaoService {
    
    @Autowired
    TipoFormacaoRepository repo;
    
    public List<TipoFormacao> lista() {
        return repo.findAll();
    }

    public TipoFormacao busca(Long id) {
        return null;
    }

    public void adiciona(TipoFormacao tipoFormacao) {
        tipoFormacao.setId(null);
        repo.save(tipoFormacao);
    }

    public void atualiza(TipoFormacao tipoFormacao) {

    }

    public void remove(TipoFormacao tipoFormacao) {

    }
}
