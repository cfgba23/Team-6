package com.example.back.model;

import java.time.LocalDateTime;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Entrepreneur {

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
    private String phoneNumber;
    
    @Column()
    private String neighbourhood;

    @Column()
    private String city;
    
    @Column()
    private String province;
    
    @Column()
    private education educationLevel;
    
    @Column(unique = true, nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;

    @ManyToMany(mappedBy = "enrolledEntrepreneurs")
    private List<Course> courses;
    
    @ManyToMany(mappedBy = "enrolledEntrepreneurs")
    private List<Event> event;
    
}
