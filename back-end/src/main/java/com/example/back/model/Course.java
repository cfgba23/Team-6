package com.example.back.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable = false)
    private String name;

    private LocalDateTime startDate;

    private LocalDateTime endEnrollDate;

    private int maxEnroll;

    private String Category;

    private String urlContent;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "course_entrepreneur",
            joinColumns = @JoinColumn(name = "course_id"),
            inverseJoinColumns = @JoinColumn(name = "entrepreneur_id")
    )
    @JsonIgnore
    private List<Entrepreneur> enrolledEntrepreneurs;
}
