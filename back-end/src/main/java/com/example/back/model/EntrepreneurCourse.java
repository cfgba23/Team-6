package com.example.back.model;

import com.example.back.dtos.CourseDTO;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class EntrepreneurCourse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "entrepreneur_id")
    private Entrepreneur user;
    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;
    private boolean completionStatus;
    private int score;

    public int compareTo(EntrepreneurCourse entrepreneurCourse) {
        return Integer.compare(this.score, entrepreneurCourse.getScore());
    }

}
