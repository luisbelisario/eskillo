package com.eskillo.eskillo.model;

import java.util.ArrayList;
import java.util.List;


public class BaseDeDadosLocalidade {
	
	List<Localidade> listaLocalidades;
	
	public BaseDeDadosLocalidade() {
		listaLocalidades = new ArrayList<Localidade>();
		
	}
	
	public void adicionarLocalidade(Localidade novaLocalidade) {
		listaLocalidades.add(novaLocalidade);
	}
	
	public void removerLocalidade(Long id) {
		for(Localidade l : listaLocalidades) {
			if(l.getId()==id) {
				listaLocalidades.remove(l);
				break;
			}
		}
	}
    
    public List<Localidade> mostrarLocalidades() {
        return listaLocalidades;
    }

	public boolean validarLocalidade(Long id) {
		boolean controle = false;
		
		for(Localidade l : listaLocalidades) {
			if(l.getId()==id) {
				controle = true;
				break;
			}
		}
		return controle;
    }

    public Localidade mostrarLocalidade(Long id) {
		
		for(Localidade l : listaLocalidades) {
			if(l.getId()==id) {
				return l;
			}
        }
        return null;
	}
}
