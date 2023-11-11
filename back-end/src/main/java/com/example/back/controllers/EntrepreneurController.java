package com.example.back.controllers;

import com.example.back.services.impl.EntrepreneurService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/entrepreneur")
@RequiredArgsConstructor
public class EntrepreneurController {

    private EntrepreneurService entrepreneurService;


    // cursos inscriptos
    // curso mas avanzado
    // curso mas proximo a ocurrir
    // todos los cursos en los que no esta incripto
}
