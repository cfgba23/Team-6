package com.example.back.repositories;

import com.example.back.model.EntrepreneurCourse;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EntrepreneurCourseRepository extends JpaRepository<EntrepreneurCourse,Long> {
    Optional<EntrepreneurCourse> findByUser_Id(long id);
}
