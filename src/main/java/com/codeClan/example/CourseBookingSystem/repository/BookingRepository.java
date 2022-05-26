package com.codeClan.example.CourseBookingSystem.repository;

import com.codeClan.example.CourseBookingSystem.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookingRepository extends JpaRepository<Booking, Long> {
    List<Booking> findByDate(String date);
}
