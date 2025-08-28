package com.senac.games.dto.request;

import com.senac.games.entity.Categoria;
import com.senac.games.entity.Inscricao;

import java.util.Set;

public class JogoDTORequest {
    private String nome;
    private Categoria categoria;
    private  int status;
    private Set<Inscricao> inscricaos ;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Set<Inscricao> getInscricaos() {
        return inscricaos;
    }

    public void setInscricaos(Set<Inscricao> inscricaos) {
        this.inscricaos = inscricaos;
    }
}
