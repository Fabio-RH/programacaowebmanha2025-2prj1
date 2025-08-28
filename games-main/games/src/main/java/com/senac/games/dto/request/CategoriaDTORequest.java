package com.senac.games.dto.request;

import com.senac.games.entity.Jogo;

import java.util.Set;

public class CategoriaDTORequest {
    private String nome;
    private Integer status;
    private Set<Jogo> jogo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Set<Jogo> getJogo() {
        return jogo;
    }

    public void setJogo(Set<Jogo> jogo) {
        this.jogo = jogo;
    }
}
