package com.example.back.controllers;

import com.example.back.dtos.CreateEntrepreneurDTO;
import com.example.back.services.impl.EntrepreneurService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/entrepreneur")
@RequiredArgsConstructor
public class EntrepreneurController {

    private EntrepreneurService entrepreneurService;

    @PostMapping()
    public ResponseEntity<CreateEntrepreneurDTO> createUserAuction(@RequestBody CreateEntrepreneurDTO createEntrepreneurDTO){
        return new ResponseEntity<>(entrepreneurService.createEntrepreneur(createEntrepreneurDTO), HttpStatus.CREATED);
    }

    // cursos inscriptos
    // curso mas avanzado
    // curso mas proximo a ocurrir
    // todos los cursos en los que no esta incripto
}
