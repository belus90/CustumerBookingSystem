package com.codeClan.example.CourseBookingSystem.repository;


import com.codeClan.example.CourseBookingSystem.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
