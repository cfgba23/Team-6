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
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    
    @Column(nullable = false)
    private String name;
    
    @Column(nullable = false)
    private LocalDateTime startDate;
    
    @Column(nullable = false)
    private LocalDateTime endEnrollDate;

    @Column()
    private int maxEnroll;
    
    @Column()
    private String category;
    
    @Column()
    private modality modality;
    
}