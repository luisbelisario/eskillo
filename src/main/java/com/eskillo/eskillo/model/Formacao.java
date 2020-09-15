package com.eskillo.eskillo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(exclude = {"nomeInstituicao", 
"tipoFormacao", 
"areaEstudo", 
"anoInicio", 
"anoFim", 
"emAndamento",
"descricao"})

public class Formacao {
    
    private Long id;
    private String nomeInstituicao;
    private TipoFormacao tipoFormacao;
    private AreaEstudo areaEstudo;
    private int anoInicio;
    private int anoFim;
    private boolean emAndamento;
    private String descricao;

}
