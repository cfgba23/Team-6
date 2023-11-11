package com.example.back.controllers;

import com.example.back.dtos.CourseDTO;
import com.example.back.services.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courses")
@RequiredArgsConstructor
public class CourseController {

    private final CourseService courseService;

    @PostMapping()
    public ResponseEntity<CourseDTO> createCourse(@RequestBody CourseDTO courseDTO){
        return new ResponseEntity<CourseDTO>(courseService.createCourse(courseDTO), HttpStatus.CREATED);
    }

    @PatchMapping("/enroll/{userId}/{courseId}")
    public ResponseEntity<CourseDTO> enrollInCourse(@PathVariable Long userId, @PathVariable Long courseId){
        return ResponseEntity.status(HttpStatus.OK).body(courseService.enroll(userId, courseId));
    }

    // cursos inscriptos
    @GetMapping("/enrolledIn/{userId}")
    public ResponseEntity<List<CourseDTO>> getEnrolledIn(@PathVariable Long userId){
        return ResponseEntity.status(HttpStatus.OK).body(courseService.getEnrolledIn(userId));
    }

    // todos los cursos en los que no esta incripto
    @GetMapping("/available/{userId}")
    public ResponseEntity<List<CourseDTO>> getAvailableToEnrollIn(@PathVariable Long userId){
        return ResponseEntity.status(HttpStatus.OK).body(courseService.getAvailableToEnrollIn(userId));

    }

    // curso mas proximo a ocurrir
    @GetMapping("/closestToStart/{userId}")
    public ResponseEntity<CourseDTO> getClosestToStart(@PathVariable Long userId){
        return ResponseEntity.status(HttpStatus.OK).body(courseService.getClosestToStart(userId));

    }

    // curso mas avanzado
    @GetMapping("/advancedIn/{userId}")
    public ResponseEntity<CourseDTO> getMostAdvancedIn(@PathVariable Long userId){
        return ResponseEntity.status(HttpStatus.OK).body(courseService.getMostAdvancedIn(userId));
    }



}
