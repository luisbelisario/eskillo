package com.eskillo.eskillo.model;

public class Competencia {
    
    private TipoCompetencia tipoCompetencia;

    public Competencia(TipoCompetencia tipoCompetencia) {
        this.tipoCompetencia = tipoCompetencia;
    }

    public TipoCompetencia getTipoCompetencia() {
        return tipoCompetencia;
    }

    public void setTipoCompetencia(TipoCompetencia tipoCompetencia) {
        this.tipoCompetencia = tipoCompetencia;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((tipoCompetencia == null) ? 0 : tipoCompetencia.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Competencia other = (Competencia) obj;
        if (tipoCompetencia == null) {
            if (other.tipoCompetencia != null)
                return false;
        } else if (!tipoCompetencia.equals(other.tipoCompetencia))
            return false;
        return true;
    }
}
