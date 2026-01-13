package com.entertainment2.entertainment2.service;

import com.entertainment2.entertainment2.model.Booking;

import java.util.List;

public interface BookingService {

    Booking createBooking(Booking booking);

    List<Booking> getAllBookings();
}
