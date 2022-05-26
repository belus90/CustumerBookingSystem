package com.codeClan.example.CourseBookingSystem.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "bookings")
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "date")
    private String date;

    @JsonIgnoreProperties({"bookings"})
    @ManyToOne
    @JoinColumn(name ="course_id", nullable = false)
    private Course course;
//
//    private Customer customer;


    public Booking(String date, Course course) {
        this.date = date;
        this.course = course;
    }

    public Booking() {
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
