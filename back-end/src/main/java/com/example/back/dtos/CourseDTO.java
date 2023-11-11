package com.example.back.dtos;

import com.example.back.model.Course;
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

    private int totalEnrolled;

    private int enrolledEntrepreneurs;
    private String category;
    private String urlContent;

    public Course toCourse(){
        Course course = new Course();
        course.setId(this.id);
        course.setName(this.name);
        course.setStartDate(this.startDate);
        course.setEndEnrollDate(this.endEnrollDate);
        course.setCreatedAt(this.createdAt);
        course.setMaxEnroll(this.maxEnroll);
        course.setCategory(this.category);
        course.setUrlContent(this.urlContent);
        course.setTotalEnrolled(this.totalEnrolled);
        return course;
    }

}
