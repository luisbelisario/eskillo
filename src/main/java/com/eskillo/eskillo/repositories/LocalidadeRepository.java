package com.eskillo.eskillo.repositories;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.eskillo.eskillo.model.Localidade;

public class LocalidadeRepository {
    
    private List<Localidade> repoLocalidades = new ArrayList<Localidade>();

    public void adiciona(Localidade localidade) {
        if(!repoLocalidades.contains(localidade)) {
            repoLocalidades.add(localidade);
        }
    }

    public void atualiza(Localidade localidade) {
        if(repoLocalidades.contains(localidade)) {
            int pos = repoLocalidades.indexOf(localidade);
            repoLocalidades.set(pos, localidade);
        }
    }

    public void remove(Localidade localidade) {
        if(repoLocalidades.contains(localidade)) {
            repoLocalidades.remove(localidade);
        }
    }

    public Localidade obtemLocalidade(Long id) {
        Localidade localidadeBuscada = null;
        for(Localidade localidade : repoLocalidades) {
            if(localidade.getId().equals(id)) {
                localidadeBuscada = localidade;
            }
        }
        return localidadeBuscada;
    }

    public List<Localidade> obtemLocalidades() {
        return Collections.unmodifiableList(repoLocalidades);
    }
}
