package com.example.back.services.impl;

import com.example.back.dtos.CourseDTO;
import com.example.back.model.Course;
import com.example.back.model.EntrepreneurCourse;
import com.example.back.repositories.CourseRepository;
import com.example.back.repositories.EntrepreneurCourseRepository;
import com.example.back.repositories.EntrepreneurRepository;
import com.example.back.services.CourseService;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Validated
public class CourseServiceImpl implements CourseService {

    private final CourseRepository courseRepository;

    private final EntrepreneurRepository entrepreneurRepository;

    private final EntrepreneurCourseRepository entrepreneurCourseRepository;

    public CourseServiceImpl(CourseRepository courseRepository, EntrepreneurRepository entrepreneurRepository, EntrepreneurCourseRepository entrepreneurCourseRepository) {
        this.courseRepository = courseRepository;
        this.entrepreneurRepository = entrepreneurRepository;
        this.entrepreneurCourseRepository = entrepreneurCourseRepository;
    }

    @Override
    public CourseDTO createCourse(CourseDTO courseDTO) {
        Course course = courseDTO.toCourse();
        Course savedCourse = courseRepository.save(course);
        courseDTO.setId(savedCourse.getId());
        return courseDTO;
    }

    @Override
    public List<CourseDTO> getEnrolledIn(Long userId) {
        return courseRepository.findByEnrolledEntrepreneurs_Id(userId).stream().map(Course::toDTO).collect(Collectors.toList());
      }

    @Override
    public List<CourseDTO> getAvailableToEnrollIn(Long userId) {
        return courseRepository.findByEnrolledEntrepreneurs_IdNot(userId).stream().map(Course::toDTO).collect(Collectors.toList());
    }

    @Override
    public CourseDTO getClosestToStart(Long userId) {
        return null;
    }

    @Override
    public CourseDTO getMostAdvancedIn(Long userId) {
        EntrepreneurCourse entrepreneurCourse = entrepreneurCourseRepository.findByUser_Id(userId).stream().max(EntrepreneurCourse::compareTo).orElse(null);
        return entrepreneurCourse.getCourse().toDTO();
    }

    @Override
    public CourseDTO enroll(Long userId, Long courseId){
        Course course = courseRepository.findById(courseId).orElse(null);
        course.getEnrolledEntrepreneurs().add(entrepreneurRepository.findById(userId).orElse(null));
        courseRepository.save(course);
        return course.toDTO();
    }
}
