package com.senac.games.dto.request;

import com.senac.games.entity.Jogo;
import com.senac.games.entity.Participante;

import java.time.LocalDateTime;

public class InscricaoDTORequest {
    private LocalDateTime data;
    private int status;
    private Participante participante;
    private Jogo jogo;

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Participante getParticipante() {
        return participante;
    }

    public void setParticipante(Participante participante) {
        this.participante = participante;
    }

    public Jogo getJogo() {
        return jogo;
    }

    public void setJogo(Jogo jogo) {
        this.jogo = jogo;
    }
}
