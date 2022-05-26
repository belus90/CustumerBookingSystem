package com.codeClan.example.CourseBookingSystem.controllers;

import com.codeClan.example.CourseBookingSystem.models.Booking;
import com.codeClan.example.CourseBookingSystem.models.Course;
import com.codeClan.example.CourseBookingSystem.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookingController {

    @Autowired
    BookingRepository bookingRepository;

    @GetMapping(value = "/bookings")
    public ResponseEntity<List<Booking>> findAll(
            @RequestParam(name = "date",required = false) String date){
        if(date != null){
            return new ResponseEntity<>(bookingRepository.findByDate(date), HttpStatus.OK);
        }
        return new ResponseEntity<>(bookingRepository.findAll(), HttpStatus.OK);
    }
}
