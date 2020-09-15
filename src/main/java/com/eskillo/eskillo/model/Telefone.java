package com.eskillo.eskillo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(exclude = {"numeroTelefone", "tipoTelefone"})

public class Telefone {
    
    private Long id;
    private String numeroTelefone;
    private TipoTelefone tipoTelefone;

    
}
