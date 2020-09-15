package com.eskillo.eskillo.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(exclude = {"descricao"})

public class AreaEstudo implements Serializable {
    
    
    private static final long serialVersionUID = 1L;
    
    private Long id;
    private String descricao;

}
