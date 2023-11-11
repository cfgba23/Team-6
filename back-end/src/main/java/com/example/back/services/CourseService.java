package com.example.back.services;

import com.example.back.dtos.CourseDTO;

import java.util.List;

public interface CourseService {
    CourseDTO createCourse(CourseDTO courseDTO);

    List<CourseDTO> getEnrolledIn(CourseDTO courseDTO, Long userId);

    List<CourseDTO> getAvailableToEnrollIn(CourseDTO courseDTO, Long userId);

    CourseDTO getClosestToStart(CourseDTO courseDTO, Long userId);

    CourseDTO getMostAdvancedIn(CourseDTO createCourseDTO, Long userId);
}
