package com.eskillo.eskillo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Localidade {
    
    private Long id;
    private String nome;
    private String uf;
    
}
