package com.senac.games.service;

import com.senac.games.dto.request.PremioDTORequest;
import com.senac.games.dto.response.PremioDTOResponse;
import com.senac.games.entity.Premio;
import com.senac.games.entity.Premio;
import com.senac.games.repository.PremioRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class PremioService {
    private final PremioRepository premioRepository;
    @Autowired
    private ModelMapper modelMapper;

    public PremioService(PremioRepository premioRepository) {
        this.premioRepository = premioRepository;
    }
    public List<Premio> listarPremio(){
        return this.premioRepository.findAll();
    }
    public PremioDTOResponse criarPremio(PremioDTORequest premioDTORequest) {

        Premio Premio = modelMapper.map(premioDTORequest, Premio.class);
        Premio premioSave = this.premioRepository.save(Premio);
        PremioDTOResponse premioDTOResponse = modelMapper.map(premioSave, PremioDTOResponse.class);
        return premioDTOResponse;
    }
}

