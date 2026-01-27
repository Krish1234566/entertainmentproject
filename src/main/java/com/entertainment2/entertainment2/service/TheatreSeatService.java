package com.entertainment2.entertainment2.service;

import com.entertainment2.entertainment2.model.TheatreSeat;
import org.hibernate.mapping.Map;

import java.util.List;

public interface TheatreSeatService {
    TheatreSeat bookSeat(Long theatreId, String seatNumber);

    List<TheatreSeat> getAvailableSeats(Long theatreId);


    Map <String, Long> getSeatStatus(Long theatreId);
}
