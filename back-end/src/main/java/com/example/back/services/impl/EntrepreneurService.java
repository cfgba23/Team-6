package com.example.back.services.impl;

import com.example.back.repositories.EntrepreneurRepository;
import com.example.back.services.EntrepeneurService;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

@Service
@Validated
public class EntrepreneurService implements EntrepeneurService {

    private EntrepreneurRepository entrepreneurRepository;
}
