package com.senac.games.entity;

import jakarta.persistence.*;


@Entity
@Table(name = "premio")
public class Premio {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "premio_id")

    private Integer id;
    @Column(name = "premio_descricao")
    private String PremioDescricao;
    @Column(name = "premio_ordem_premiacao")
    private int PremioOrdemPremiacao;
    @Column(name = "premio_categoria")
    private int premioCategoria;

    @Column(name = "premio_status")
    private int premioStatus;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPremioOrdemPremiacao() {
        return PremioOrdemPremiacao;
    }

    public void setPremioOrdemPremiacao(int ordem) {
        this.PremioOrdemPremiacao = ordem;
    }

    public String getPremioDescricao() {
        return PremioDescricao;
    }

    public void setPremioDescricao(String descricao) {
        this.PremioDescricao = descricao;
    }

    public int getpremioStatus() {
        return premioStatus;
    }

    public int getpremioCategoria() {
        return premioCategoria;
    }

    public void setpremioCategoria(int categoria) {
        this.premioCategoria = categoria;
    }

    public void setpremioStatus(int status) {
        this.premioStatus = status;
    }
}
