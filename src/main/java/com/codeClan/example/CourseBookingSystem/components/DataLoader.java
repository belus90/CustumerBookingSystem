package com.codeClan.example.CourseBookingSystem.components;

import com.codeClan.example.CourseBookingSystem.models.Booking;
import com.codeClan.example.CourseBookingSystem.models.Course;
import com.codeClan.example.CourseBookingSystem.models.Customer;
import com.codeClan.example.CourseBookingSystem.repository.BookingRepository;
import com.codeClan.example.CourseBookingSystem.repository.CourseRepository;
import com.codeClan.example.CourseBookingSystem.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    CustomerRepository customerRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args){
        Course course1 = new Course("Intro to Java","Edinburgh",4.7);
        courseRepository.save(course1);

        Booking booking = new Booking("12-05-22", course1);
        bookingRepository.save(booking);

        Course course = new Course("Intro to Python","Edinburgh",4.7);
        courseRepository.save(course);

        Customer customer = new Customer("Sofia","Glasgow",26);
        customerRepository.save(customer);
    }
}
