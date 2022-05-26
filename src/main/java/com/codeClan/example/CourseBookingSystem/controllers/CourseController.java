package com.codeClan.example.CourseBookingSystem.controllers;

import com.codeClan.example.CourseBookingSystem.models.Course;
import com.codeClan.example.CourseBookingSystem.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseController {
    @Autowired
    CourseRepository courseRepository;

//    @GetMapping(value = "/courses")
//    public ResponseEntity<List<Course>> getAllCourses(){
//        return new ResponseEntity<>(courseRepository.findAll(), HttpStatus.OK);
//    }

    @GetMapping(value = "/courses")
    public ResponseEntity<List<Course>> findByStarRating(@RequestParam(name = "rating",required = false) Double rating){
        if(rating != null){
            return new ResponseEntity<>(courseRepository.findByRating(rating),HttpStatus.OK);
        }
        return new ResponseEntity<>(courseRepository.findAll(), HttpStatus.OK);
    }


}
