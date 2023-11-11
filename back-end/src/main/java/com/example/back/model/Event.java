package com.example.back.model;

import com.example.back.dtos.EventDTO;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable = false)
    private String name;

    @Column()
    private int totalEnrolled;

    @Column(nullable = false)
    private LocalDateTime startDate;

    @Column(nullable = false)
    private LocalDateTime endEnrollDate;

    @Column()
    private int maxEnroll;

    @Column()
    private String category;

    @Column()
    private Modality modality;

    @Column(nullable = false)
    private LocalDateTime createdAt;

    private String urlContent;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "event_entrepreneur",
            joinColumns = @JoinColumn(name = "event_id"),
            inverseJoinColumns = @JoinColumn(name = "entrepreneur_id")
    )
    @JsonIgnore
    private List<Entrepreneur> enrolledEntrepreneurs;

    public EventDTO toDTO(){
        EventDTO dto = new EventDTO();
        dto.setId(this.id);
        dto.setName(this.name);
        dto.setStartDate(this.startDate);
        dto.setEndEnrollDate(this.endEnrollDate);
        dto.setMaxEnroll(this.maxEnroll);
        dto.setCategory(this.category);
        dto.setModality(this.modality);
        dto.setCreatedAt(this.createdAt);
        dto.setUrlContent(this.urlContent);
        dto.setTotalEnrolled(this.totalEnrolled);
        return dto;
    }

    public int compareTo(Event event) {
        return this.getStartDate().compareTo(event.getStartDate());
    }
}