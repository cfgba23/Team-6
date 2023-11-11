package com.example.back.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    
    @Column(nullable = false)
    private String name;
    
    @Column(nullable = false)
    private String lastName;
    
    @Column(nullable = false)
    private LocalDateTime dob;
    
    @Column(unique = true, nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;
    
}