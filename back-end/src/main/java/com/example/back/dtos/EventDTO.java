package com.example.back.dtos;

import com.example.back.model.Event;
import com.example.back.model.Modality;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
@Getter
@Setter
public class EventDTO {

    private long id;
    private String name;
    private LocalDateTime startDate;
    private LocalDateTime endEnrollDate;
    private LocalDateTime createdAt;
    private int maxEnroll;

    private int totalEnrolled;

    private int enrolledEntrepreneurs;
    private String category;

    private Modality modality;
    private String urlContent;

    public Event toEvent(){
        Event event = new Event();
        event.setId(this.id);
        event.setName(this.name);
        event.setStartDate(this.startDate);
        event.setEndEnrollDate(this.endEnrollDate);
        event.setCreatedAt(this.createdAt);
        event.setMaxEnroll(this.maxEnroll);
        event.setCategory(this.category);
        event.setUrlContent(this.urlContent);
        event.setModality(this.modality);
        event.setTotalEnrolled(this.totalEnrolled);
        return event;
    }
}
