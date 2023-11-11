package com.example.back.services.impl;

import com.example.back.dtos.EntrepreneurDTO;
import com.example.back.dtos.SafeEntrepreneurDTO;
import com.example.back.model.Entrepreneur;
import com.example.back.repositories.EntrepreneurRepository;
import com.example.back.services.EntrepeneurService;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

@Service
@Validated
public class EntrepreneurService implements EntrepeneurService {

    private EntrepreneurRepository entrepreneurRepository;

    @Override
    public SafeEntrepreneurDTO createEntrepreneur(EntrepreneurDTO createEntrepreneurDTO) {
        return entrepreneurRepository.save(createEntrepreneurDTO.toEntity()).toDTO();
    }

    @Override
    public SafeEntrepreneurDTO logIn(EntrepreneurDTO createEntrepreneurDTO) {
        return entrepreneurRepository.findByEmailAndPassword(createEntrepreneurDTO.getEmail(), createEntrepreneurDTO.getPassword()).toDTO();
    }
}
