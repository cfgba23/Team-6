package com.example.back.model;

import com.example.back.dtos.CourseDTO;
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

    @Column(nullable = false)
    private LocalDateTime createdAt;

    private LocalDateTime startDate;

    private LocalDateTime endEnrollDate;

    private int maxEnroll;

    private String category;

    private String urlContent;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "EntrepreneurCourse",
            joinColumns = @JoinColumn(name = "course_id"),
            inverseJoinColumns = @JoinColumn(name = "entrepreneur_id")
    )
    @JsonIgnore
    private List<Entrepreneur> enrolledEntrepreneurs;

    public CourseDTO toDTO(){
        CourseDTO dto = new CourseDTO();
        dto.setId(this.id);
        dto.setName(this.name);
        dto.setCreatedAt(this.createdAt);
        dto.setStartDate(this.startDate);
        dto.setEndEnrollDate(this.endEnrollDate);
        dto.setMaxEnroll(this.maxEnroll);
        dto.setCategory(this.category);
        dto.setUrlContent(this.urlContent);
        return dto;
    }
}
