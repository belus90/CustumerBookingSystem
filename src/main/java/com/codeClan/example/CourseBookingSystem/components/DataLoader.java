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

        Course course1 = new Course("Intro to Java","Edinburgh",5.0);
        courseRepository.save(course1);

        Course course = new Course("Intro to CSS","Stirling",4.0);
        courseRepository.save(course);

        Course course2 = new Course("Intro to C++","Glasgow",4.7);
        courseRepository.save(course2);

        Course course3 = new Course("Intro to Python","Glasgow",3.2);
        courseRepository.save(course3);

        Course course4 = new Course("Intro to JavaScript","Edinburgh",3.2);
        courseRepository.save(course4);


        Customer customer = new Customer("Mate","Bp",18);
        customerRepository.save(customer);

        Customer customer1 = new Customer("Bob","Kalocsa",15);
        customerRepository.save(customer1);

        Customer customer2 = new Customer("Claire","Invernes",24);
        customerRepository.save(customer2);


        Booking booking = new Booking("12-05-21", course1,customer1);
        bookingRepository.save(booking);


        Booking booking1 = new Booking("12-04-22", course4,customer1);
        bookingRepository.save(booking1);


        Booking booking2 = new Booking("12-03-11", course3,customer2);
        bookingRepository.save(booking2);



        Customer customer4 = new Customer("Sofia","Glasgow",26);
        customerRepository.save(customer4);
    }
}
