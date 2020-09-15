package com.eskillo.eskillo.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(exclude = {"nome", 
"organizacao", 
"cargaHoraria", 
"dataInicio", 
"dataFim", 
"descricao"})

public class Curso {
    
    private Long id;
    private String nome;
    private String organizacao;
    private int cargaHoraria;
    private Date dataInicio;
    private Date dataFim;
    private String descricao;

}
