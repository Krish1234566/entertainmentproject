package com.entertainment2.entertainment2.service;

import com.entertainment2.entertainment2.model.ShowTime;

import java.util.List;

public interface ShowTimeService {
    ShowTime addShowTime(ShowTime showTime);

    List<ShowTime> getShowTime(Long id);

    List<ShowTime> getShowTimesByMovie(Long movieId);

    List<ShowTime> getShowTimesByTheatre(Long theatreId);

    List<ShowTime> getAllShowTimes();

    List<ShowTime> getShowTimesByBookingId(Long bookingId);
}
