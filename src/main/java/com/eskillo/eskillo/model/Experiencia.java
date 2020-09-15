package com.eskillo.eskillo.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(exclude = {"cargo", 
"tipoEmprego", 
"nomeEmpresa", 
"localidade", 
"dataInicio", 
"dataFim",
"ocupacaoAtual",
"descricao"})

public class Experiencia {
    
    private Long id;
    private String cargo;
    private TipoEmprego tipoEmprego;
    private String nomeEmpresa;
    private Localidade localidade;
    private Date dataInicio;
    private Date dataFim;
    private boolean ocupacaoAtual;
    private String descricao;
    
}
