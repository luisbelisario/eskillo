package com.eskillo.eskillo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Fotografia {
    
    private byte[] fotografia;
    private String tipoArquivo;

   
}
