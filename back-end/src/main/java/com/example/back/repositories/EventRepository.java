package com.example.back.repositories;

import com.example.back.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Arrays;
import java.util.List;

public interface EventRepository extends JpaRepository<Event,Long> {
    List<Event> findByEnrolledEntrepreneurs_Id(long id);


    List<Event> findByEnrolledEntrepreneurs_IdNot(Long userId);
}
