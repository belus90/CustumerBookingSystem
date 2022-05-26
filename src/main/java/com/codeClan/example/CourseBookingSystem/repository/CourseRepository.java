package com.codeClan.example.CourseBookingSystem.repository;

import com.codeClan.example.CourseBookingSystem.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long> {

        List<Course> findByRating(double star_rating);
        List<Course> findByBookingsCustomerName(String name);
        }
