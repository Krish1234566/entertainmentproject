package com.entertainment2.entertainment2.controller;

import com.entertainment2.entertainment2.model.Booking;
import com.entertainment2.entertainment2.service.BookingService;
import com.entertainment2.entertainment2.serviceimpl.BookingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class BookingController {

    @Autowired
    BookingService bookingService;

    @PostMapping("/addBooking")
    public Booking createBooking(@RequestBody Booking booking) {
        return bookingService.createBooking(booking);
    }
    @GetMapping
    public List<Booking> getAllBookings() {
        return bookingService.getAllBookings();
    }
}


