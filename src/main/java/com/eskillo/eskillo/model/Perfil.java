package com.eskillo.eskillo.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Perfil {
    
    private Long id;
    private String nome;
    private String sobre;
    private String cargoAtual;
    private Localidade localidade;
    private String email;
    private String endereco;
    private String complemento;
    private String bairro;
    private String cidade;
    private Date dataNascimento;
    private boolean visibilidadePerfil;

    private List<Experiencia> experiencias = new ArrayList<>();
    private List<Formacao> formacoes = new ArrayList<>();
    private List<Curso> cursos = new ArrayList<>();
    private List<Competencia> competencia = new ArrayList<>();
    private List<Telefone> telefones = new ArrayList<>();

    public Perfil(Long id, String nome, String sobre, String cargoAtual, Localidade localidade, String email,
            String endereco, String complemento, String bairro, String cidade, Date dataNascimento,
            boolean visibilidadePerfil) {
        this.id = id;
        this.nome = nome;
        this.sobre = sobre;
        this.cargoAtual = cargoAtual;
        this.localidade = localidade;
        this.email = email;
        this.endereco = endereco;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.dataNascimento = dataNascimento;
        this.visibilidadePerfil = visibilidadePerfil;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobre() {
        return sobre;
    }

    public void setSobre(String sobre) {
        this.sobre = sobre;
    }

    public String getCargoAtual() {
        return cargoAtual;
    }

    public void setCargoAtual(String cargoAtual) {
        this.cargoAtual = cargoAtual;
    }

    public Localidade getLocalidade() {
        return localidade;
    }

    public void setLocalidade(Localidade localidade) {
        this.localidade = localidade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public boolean isVisibilidadePerfil() {
        return visibilidadePerfil;
    }

    public void setVisibilidadePerfil(boolean visibilidadePerfil) {
        this.visibilidadePerfil = visibilidadePerfil;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
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
        Perfil other = (Perfil) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }
}
