package com.codeClan.example.CourseBookingSystem.repository;

import com.codeClan.example.CourseBookingSystem.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
        }
