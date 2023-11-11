package com.example.back.repositories;

import com.example.back.model.Course;
import com.example.back.model.Entrepreneur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course,Long> {
}
