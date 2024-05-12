package com.example.InterviewTest.controller;


import com.example.InterviewTest.entity.Event;
import com.example.InterviewTest.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class EventController {

  @Autowired
  EventService eventService;


  @PostMapping("/addAnEvent")
  public Event addAnEvent(@RequestBody Event ev) {
      Event event = eventService.addEvent(ev);
      return event;
  }

  @GetMapping("/showAnEvent/{id}")
  public Event getAnEvent(@PathVariable("id") Long id) {
    Event event = eventService.getAnEvent(id);
    return event;
  }
}
