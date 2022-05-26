package com.codeClan.example.CourseBookingSystem.controllers;


import com.codeClan.example.CourseBookingSystem.models.Course;
import com.codeClan.example.CourseBookingSystem.models.Customer;
import com.codeClan.example.CourseBookingSystem.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    @GetMapping(value = "/customers")
    public ResponseEntity<List<Customer>> findCourseByName(@RequestParam(name = "name",required = false) String name){
        if(name != null){
            return new ResponseEntity<>(customerRepository.findCourseByName(name), HttpStatus.OK);
        }
        return new ResponseEntity<>(customerRepository.findAll(), HttpStatus.OK);
    }

}
