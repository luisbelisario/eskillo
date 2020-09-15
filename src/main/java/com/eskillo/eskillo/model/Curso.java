package com.eskillo.eskillo.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Curso {
    
    private String nome;
    private String organizacao;
    private int cargaHoraria;
    private Date dataInicio;
    private Date dataFim;
    private String descricao;

}
