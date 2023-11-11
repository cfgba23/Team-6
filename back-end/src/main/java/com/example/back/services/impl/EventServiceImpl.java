package com.example.back.services.impl;

import com.example.back.dtos.EventDTO;
import com.example.back.model.EntrepreneurCourse;
import com.example.back.model.Event;
import com.example.back.repositories.EntrepreneurRepository;
import com.example.back.repositories.EventRepository;
import com.example.back.services.EventService;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.List;


@Service
@Validated
public class EventServiceImpl implements EventService {

    private final EventRepository eventRepository;

    private final EntrepreneurRepository entrepreneurRepository;

    public EventServiceImpl(EventRepository eventRepository, EntrepreneurRepository entrepreneurRepository) {
        this.eventRepository = eventRepository;
        this.entrepreneurRepository = entrepreneurRepository;
    }

    @Override
    public EventDTO createEvent(EventDTO eventDTO) {
        return null;
    }

    @Override
    public List<EventDTO> getEnrolledIn(Long userId) {
        return eventRepository.findByEnrolledEntrepreneurs_Id(userId).stream().map(Event::toDTO).collect(java.util.stream.Collectors.toList());
    }

    @Override
    public List<EventDTO> getAvailableToEnrollIn(Long userId) {
        return eventRepository.findByEnrolledEntrepreneurs_IdNot(userId).stream().map(Event::toDTO).collect(java.util.stream.Collectors.toList());
    }

    @Override
    public EventDTO getClosestToStart( Long userId) {
        Event event = eventRepository.findByEnrolledEntrepreneurs_Id(userId).stream().max(Event::compareTo).orElse(null);
        return event.toDTO();
    }

    @Override
    public EventDTO enroll(Long userId, Long eventId) {
        Event event = eventRepository.findById(eventId).orElse(null);
        if (event != null) {
            event.getEnrolledEntrepreneurs().add(entrepreneurRepository.findById(userId).orElse(null));
            event.setTotalEnrolled(event.getEnrolledEntrepreneurs().size());
            eventRepository.save(event);
            return event.toDTO();
        }
        return null;
    }
}
