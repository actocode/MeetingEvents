package com.example.InterviewTest.service;


import com.example.InterviewTest.entity.Event;
import com.example.InterviewTest.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventService {

  @Autowired
  EventRepository eventRepository;

    public Event addEvent(Event ev) {
      Event event = new Event(ev.getId(), ev.getTitle(),ev.getStartTime(), ev.getEndTime(), ev.getCalenderList());
       eventRepository.save(event);
       return event;
    }

    public Event getAnEvent(Long id) {
       return eventRepository.findById(id).orElseThrow(() -> new RuntimeException("Event not found"));
    }
}
