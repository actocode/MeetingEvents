package com.example.InterviewTest.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Table
@Entity
public class Calender {


  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @OneToOne
  private Person person;
  private String description;

  public Calender() {

  }

  public Calender(Long id, Person person, String description, LocalDateTime createdOn, LocalDateTime updatedOn) {
    this.id = id;
    this.person = person;
    this.description = description;
    this.createdOn = createdOn;
    this.updatedOn = updatedOn;
  }

  private LocalDateTime createdOn;
  private LocalDateTime updatedOn;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Person getUser() {
    return person;
  }

  public void setUser(Person person) {
    this.person = person;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public LocalDateTime getCreatedOn() {
    return createdOn;
  }

  public void setCreatedOn(LocalDateTime createdOn) {
    this.createdOn = createdOn;
  }

  public LocalDateTime getUpdatedOn() {
    return updatedOn;
  }

  public void setUpdatedOn(LocalDateTime updatedOn) {
    this.updatedOn = updatedOn;
  }
}
