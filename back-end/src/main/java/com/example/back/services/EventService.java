package com.example.back.services;

import com.example.back.dtos.EventDTO;

import java.util.List;

public interface EventService {
    EventDTO createEvent(EventDTO eventDTO);

    List<EventDTO> getEnrolledIn( Long userId);

    List<EventDTO> getAvailableToEnrollIn( Long userId);

    EventDTO getClosestToStart(Long userId);

    EventDTO enroll(Long userId, Long courseId);
}
