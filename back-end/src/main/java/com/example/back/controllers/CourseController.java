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

    // cursos inscriptos
    @GetMapping("/enrolledIn/{userId}")
    public ResponseEntity<List<CourseDTO>> getEnrolledIn(@RequestBody CourseDTO courseDTO, @PathVariable Long userId){
        return ResponseEntity.status(HttpStatus.OK).body(courseService.getEnrolledIn(courseDTO, userId));
    }

    // todos los cursos en los que no esta incripto
    @GetMapping("/available/{userId}")
    public ResponseEntity<List<CourseDTO>> getAvailableToEnrollIn(@RequestBody CourseDTO courseDTO, @PathVariable Long userId){
        return ResponseEntity.status(HttpStatus.OK).body(courseService.getAvailableToEnrollIn(courseDTO, userId));

    }

    // curso mas proximo a ocurrir
    @GetMapping("/closestToStart/{userId}")
    public ResponseEntity<CourseDTO> getClosestToStart(@RequestBody CourseDTO courseDTO, @PathVariable Long userId){
        return ResponseEntity.status(HttpStatus.OK).body(courseService.getClosestToStart(courseDTO, userId));

    }

    // curso mas avanzado
    @GetMapping("/advancedIn/{userId}")
    public ResponseEntity<CourseDTO> getMostAdvancedIn(@RequestBody CourseDTO courseDTO, @PathVariable Long userId){
        return ResponseEntity.status(HttpStatus.OK).body(courseService.getMostAdvancedIn(courseDTO, userId));
    }



}
