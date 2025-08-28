package com.senac.games.dto.response;

public class PremioDTOResponse {
    private int id;
    private String descricao;
    private Integer ordem_premiacao;
    private Integer categoria;
    private Integer status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getOrdem_premiacao() {
        return ordem_premiacao;
    }

    public void setOrdem_premiacao(Integer ordem_premiacao) {
        this.ordem_premiacao = ordem_premiacao;
    }

    public Integer getCategoria() {
        return categoria;
    }

    public void setCategoria(Integer categoria) {
        this.categoria = categoria;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
