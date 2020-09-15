package com.eskillo.eskillo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(exclude = {"tipoCompetencia"})

public class Competencia {
    
    private Long id;
    private TipoCompetencia tipoCompetencia;
}
