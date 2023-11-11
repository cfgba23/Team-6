package com.example.back.repositories;

import com.example.back.model.Course;
import com.example.back.model.Entrepreneur;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;
import java.util.List;

public interface CourseRepository extends JpaRepository<Course,Long> {
    List<Course> findByEnrolledEntrepreneurs_Id(long id);

    List<Course> findByEnrolledEntrepreneurs_IdNot(long id);





}
