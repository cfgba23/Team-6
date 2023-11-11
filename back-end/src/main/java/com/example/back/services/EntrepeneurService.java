package com.example.back.services;

import com.example.back.dtos.EntrepreneurDTO;
import com.example.back.dtos.SafeEntrepreneurDTO;

public interface EntrepeneurService {
    SafeEntrepreneurDTO createEntrepreneur(EntrepreneurDTO createEntrepreneurDTO);

    SafeEntrepreneurDTO logIn(EntrepreneurDTO createEntrepreneurDTO);
}
