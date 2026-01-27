package com.entertainment2.entertainment2.serviceimpl;

import com.entertainment2.entertainment2.model.TheatreSeat;
import com.entertainment2.entertainment2.repository.TheatreSeatRepo;
import com.entertainment2.entertainment2.service.TheatreSeatService;
import org.hibernate.mapping.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public class TheatreSeatImpl implements TheatreSeatService {
    @Autowired
    TheatreSeatRepo theatreSeatRepo;
    @Override
    public TheatreSeat bookSeat(Long theatreId, String seatNumber) {
        return null;
    }

    @Override
    public List<TheatreSeat> getAvailableSeats(Long theatreId) {
        return List.of();
    }

    @Override
    public Map<String, Long> getSeatStatus(Long theatreId) {
        return null;
    }


}
