package com.codeClan.example.CourseBookingSystem.repository;


import com.codeClan.example.CourseBookingSystem.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    List<Customer> findCourseByName(String name);

}
