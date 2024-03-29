package com.example.back.model;

import com.example.back.dtos.SafeEntrepreneurDTO;
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

    @Column(unique = true, nullable = false)
    private String email;

    @Column(nullable = false)
    private String phoneNumber;

    @Column(nullable = false)
    private String password;

    @ManyToMany(mappedBy = "enrolledEntrepreneurs")
    private List<Course> courses;

    @ManyToMany(mappedBy = "enrolledEntrepreneurs")
    private List<Event> events;


    public SafeEntrepreneurDTO toDTO(){
        SafeEntrepreneurDTO dto = new SafeEntrepreneurDTO();
        dto.setId(id);
        dto.setName(name);
        dto.setLastName(lastName);
        dto.setEmail(email);
        dto.setPhoneNumber(phoneNumber);
        return dto;
    }
}
