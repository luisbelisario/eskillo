package com.eskillo.eskillo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Localidade {
    
    private Long id;
    @EqualsAndHashCode.Exclude
    private String nome;
    @EqualsAndHashCode.Exclude
    private String uf;
    
}
