package com.example.InterviewTest.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Event {


  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String title;
  private LocalDateTime startTime;
  private LocalDateTime endTime;


  @OneToMany
  private List<Calender> calenderList;

  public Event() {

  }

  public Event(Long id, String title, LocalDateTime startTime, LocalDateTime endTime, List<Calender> calenderList) {
    this.id = id;
    this.title = title;
    this.startTime = startTime;
    this.endTime = endTime;
    this.calenderList = calenderList;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public LocalDateTime getStartTime() {
    return startTime;
  }

  public void setStartTime(LocalDateTime startTime) {
    this.startTime = startTime;
  }

  public LocalDateTime getEndTime() {
    return endTime;
  }

  public void setEndTime(LocalDateTime endTime) {
    this.endTime = endTime;
  }

  public List<Calender> getCalenderList() {
    return calenderList;
  }

  public void setCalenderList(List<Calender> calenderList) {
    this.calenderList = calenderList;
  }
}
