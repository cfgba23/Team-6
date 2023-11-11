package com.example.back.dtos;

import com.example.back.model.EntrepreneurCourse;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CourseDTO {

    private long id;
    private String name;
    private LocalDateTime startDate;
    private LocalDateTime endEnrollDate;
    private LocalDateTime createdAt;
    private int maxEnroll;
    private String category;
    private String urlContent;

}
