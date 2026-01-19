package com.entertainment2.entertainment2.serviceimpl;

import com.entertainment2.entertainment2.model.Booking;
import com.entertainment2.entertainment2.repository.BookingRepo;
import com.entertainment2.entertainment2.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingServiceImpl implements BookingService {
    @Autowired
    BookingRepo bookingRepo;

    @Override
    public Booking createBooking(Booking booking) {
        return bookingRepo.save(booking);
    }

    @Override
    public List<Booking> getAllBookings() {
        return List.of();
    }

    @Override
    public List<Booking> getBookingsByShowTimeId(Long showTimeId) {
        return List.of();
    }
}