package com.example.back.controllers;

import com.example.back.dtos.CourseDTO;
import com.example.back.dtos.EventDTO;
import com.example.back.services.EventService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/events")
@RequiredArgsConstructor
public class EventController {

    private final EventService eventService;

    @PostMapping()
    public ResponseEntity<EventDTO> createEvent(@RequestBody EventDTO eventDTO){
        return new ResponseEntity<EventDTO>(eventService.createEvent(eventDTO), HttpStatus.CREATED);
    }

    // cursos inscriptos
    @GetMapping("/enrolledIn/{userId}")
    public ResponseEntity<List<EventDTO>> getEnrolledIn(@PathVariable Long userId){
        return ResponseEntity.status(HttpStatus.OK).body(eventService.getEnrolledIn( userId));
    }

    // todos los cursos en los que no esta incripto
    @GetMapping("/available/{userId}")
    public ResponseEntity<List<EventDTO>> getAvailableToEnrollIn(@PathVariable Long userId){
        return ResponseEntity.status(HttpStatus.OK).body(eventService.getAvailableToEnrollIn(userId));

    }

    // curso mas proximo a ocurrir
    @GetMapping("/closestToStart/{userId}")
    public ResponseEntity<EventDTO> getClosestToStart(@PathVariable Long userId){
        return ResponseEntity.status(HttpStatus.OK).body(eventService.getClosestToStart(userId));

    }

    @PatchMapping("/enroll/{id}")
    public ResponseEntity<?> enrollInEvent(@PathVariable Long userId, @PathVariable Long courseId){
        return ResponseEntity.status(HttpStatus.OK).body(eventService.enroll(userId, courseId));
    }

}
