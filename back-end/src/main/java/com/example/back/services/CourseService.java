package com.example.back.services;

import com.example.back.dtos.CourseDTO;

import java.util.List;

public interface CourseService {
    CourseDTO createCourse(CourseDTO courseDTO);

    List<CourseDTO> getEnrolledIn(Long userId);

    List<CourseDTO> getAvailableToEnrollIn(Long userId);

    CourseDTO getClosestToStart(Long userId);

    CourseDTO getMostAdvancedIn(Long userId);

    CourseDTO enroll(Long userId, Long courseId);
}
