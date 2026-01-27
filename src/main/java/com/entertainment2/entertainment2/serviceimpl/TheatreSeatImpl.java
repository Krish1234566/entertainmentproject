package com.entertainment2.entertainment2.serviceimpl;

import com.entertainment2.entertainment2.model.TheatreSeat;
import com.entertainment2.entertainment2.repository.TheatreRepo;
import com.entertainment2.entertainment2.repository.TheatreSeatRepo;
import com.entertainment2.entertainment2.service.TheatreSeatService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import static java.util.Arrays.stream;

@Service
public class TheatreSeatImpl implements TheatreSeatService {
    @Autowired
    TheatreSeatRepo theatreSeatRepo;
    @Override
    public TheatreSeat bookSeat(Long theatreId, String seatNumber) {
        long available = theatreSeatRepo.countByTheatreIdAndBookedFalse(theatreId);
        if (available == 0) {
            throw new RuntimeException("Theatre is FULL!");
        }

       /* Optional<TheatreSeat> existing = theatreSeatRepo.findByTheatreIdAndBookedFalse(theatreId)
            .stream().filter(s -> s.getSeatNumber().equals(seatNumber))
              .findFirst();*/
        Optional<Object> existing = theatreSeatRepo.findByTheatreIdAndBookedFalse(theatreId)
               .stream().findFirst();
if(existing.isPresent()) {
    TheatreSeat seat = (TheatreSeat) existing.get();

    seat.setBooked(true);
    return theatreSeatRepo.save(seat);

}
 return null;
    }


    @Override
    public List<TheatreSeat> getAvailableSeats(Long theatreId) {
        return theatreSeatRepo.findAllByTheatreId(theatreId);
    }

   /* @Override
    public List <TheatreSeat> getSeatStatus(Long theatreId) {
        return theatreSeatRepo.findAllByTheatreId(theatreId);
    }*/
    public Map<String, Object> getTheatreStatus(Long theatreId) {
        List<TheatreSeat> allSeats = theatreSeatRepo.findAllByTheatreId(theatreId);
        long totalSeats = allSeats.size();
        long availableSeats = theatreSeatRepo.countByTheatreIdAndBookedFalse(theatreId);
        long filledSeats = totalSeats - availableSeats;

        Map<String, Object> status = new HashMap<String, Object>();
        status.put("theatreId", theatreId);
        status.put("totalSeats", totalSeats);
        status.put("filledSeats", filledSeats);
        status.put("availableSeats", availableSeats);
        status.put("isFull", availableSeats == 0);
        status.put("seats", allSeats);  // Each seat status

        return status;
    }
}



