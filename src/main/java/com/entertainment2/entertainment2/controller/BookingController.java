package com.entertainment2.entertainment2.controller;

import com.entertainment2.entertainment2.model.Booking;
import com.entertainment2.entertainment2.service.BookingService;
import com.entertainment2.entertainment2.serviceimpl.BookingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Booking")
public class BookingController {

    @Autowired
    BookingService bookingService;

    @PostMapping("/addBooking")
    public Booking createBooking(@RequestBody Booking booking) {
        return bookingService.createBooking(booking);
    }

    @GetMapping ("/showAllBooking")
    public List<Booking> getAllBookings() {
        return bookingService.getAllBookings();
    }

    // READ BY ShowTime ID - GET /api/bookings/showtime/{showTimeId}
    @GetMapping("/showtime/{showTimeId}")
    public List<Booking> getBookingsByShowTime(@PathVariable Long showTimeId) {
        return bookingService.getBookingsByShowTimeId(showTimeId);
    }
}


