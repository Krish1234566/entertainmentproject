package com.entertainment2.entertainment2.controller;

import com.entertainment2.entertainment2.model.TheatreSeat;
import com.entertainment2.entertainment2.service.TheatreSeatService;
import com.entertainment2.entertainment2.service.TheatreService;
import org.hibernate.mapping.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/TheatreSeat")
public class TheatreSeatController {
    @Autowired
    TheatreSeatService theatreSeatService;

    @PostMapping("/book/{theatreId}/{seatNumber}")

    public TheatreSeat bookSeat(@PathVariable Long theatreId,String seatNumber) {

   return theatreSeatService.bookSeat(theatreId,seatNumber);
    }

    @GetMapping("/available/{theatreId}")

    public List<TheatreSeat> getAvailableSeats(@PathVariable Long theatreId){

        return theatreSeatService.getAvailableSeats(theatreId);

    }
    @GetMapping("/status/{theatreId}")

  public Map <String, Long> getSeatStatus(@PathVariable Long theatreId){
        return theatreSeatService.getSeatStatus(theatreId);
    }
}
