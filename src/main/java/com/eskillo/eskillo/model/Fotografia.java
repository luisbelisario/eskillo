package com.eskillo.eskillo.model;

public class Fotografia {
    
    private byte[] fotografia;
    private String tipoArquivo;

    public Fotografia(byte[] fotografia, String tipoArquivo) {
        this.fotografia = fotografia;
        this.tipoArquivo = tipoArquivo;
    }

    public byte[] getFotografia() {
        return fotografia;
    }

    public void setFotografia(byte[] fotografia) {
        this.fotografia = fotografia;
    }

    public String getTipoArquivo() {
        return tipoArquivo;
    }

    public void setTipoArquivo(String tipoArquivo) {
        this.tipoArquivo = tipoArquivo;
    }
}
