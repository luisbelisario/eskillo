package com.eskillo.eskillo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor


public class Telefone {
    
    private Long id;
    private String numeroTelefone;
    private TipoTelefone tipoTelefone;

    
}
