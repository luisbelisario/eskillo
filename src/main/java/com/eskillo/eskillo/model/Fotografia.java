package com.eskillo.eskillo.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(exclude = {"fotografia", "tipoArquivo"})

public class Fotografia {
    
    private Long id;
    private byte[] fotografia;
    private String tipoArquivo;

}
