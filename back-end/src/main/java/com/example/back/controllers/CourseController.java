package com.example.back.controllers;

import com.example.back.dtos.CreateCourseDTO;
import com.example.back.services.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/courses")
@RequiredArgsConstructor
public class CourseController {

    private CourseService courseService;

    @PostMapping()
    public ResponseEntity<CreateCourseDTO> createUserAuction(@RequestBody CreateCourseDTO createCourseDTO){
        return new ResponseEntity<CreateCourseDTO>(courseService.createCourse(createCourseDTO), HttpStatus.CREATED);
    }
}
