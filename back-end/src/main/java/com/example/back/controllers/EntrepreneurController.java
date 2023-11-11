package com.example.back.controllers;

import com.example.back.dtos.EntrepreneurDTO;
import com.example.back.dtos.SafeEntrepreneurDTO;
import com.example.back.services.impl.EntrepreneurService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/entrepreneur")
@RequiredArgsConstructor
public class EntrepreneurController {

    private EntrepreneurService entrepreneurService;

    @PostMapping("/signUp")
    public ResponseEntity<SafeEntrepreneurDTO> createUserAuction(@RequestBody EntrepreneurDTO createEntrepreneurDTO){
        return new ResponseEntity<>(entrepreneurService.createEntrepreneur(createEntrepreneurDTO), HttpStatus.CREATED);
    }

    @GetMapping("/login")
    public ResponseEntity<SafeEntrepreneurDTO> logIn(@RequestBody EntrepreneurDTO createEntrepreneurDTO){
        return new ResponseEntity<>(entrepreneurService.logIn(createEntrepreneurDTO), HttpStatus.CREATED);
    }


}
