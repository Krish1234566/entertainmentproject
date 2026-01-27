package com.entertainment2.entertainment2.service;

import com.entertainment2.entertainment2.model.TheatreSeat;


import java.util.List;
import java.util.Map;

public interface TheatreSeatService {
    TheatreSeat bookSeat(Long theatreId, String seatNumber);

    List<TheatreSeat> getAvailableSeats(Long theatreId);


  //  List<TheatreSeat> getSeatStatus(Long theatreId);
  public Map<String, Object> getTheatreStatus(Long theatreId);
}
