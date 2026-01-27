package com.entertainment2.entertainment2.controller;

import com.entertainment2.entertainment2.model.TheatreSeat;
import com.entertainment2.entertainment2.service.TheatreSeatService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/TheatreSeat")
public class TheatreSeatController {
    @Autowired
    TheatreSeatService theatreSeatService;

    @PostMapping("/book/{theatreId}")

    public TheatreSeat bookSeat(@PathVariable Long theatreId,@RequestBody String seatNumber) {

   return theatreSeatService.bookSeat(theatreId,seatNumber);
    }

    @GetMapping("/available/{theatreId}")

    public List<TheatreSeat> getAvailableSeats(@PathVariable Long theatreId){

        return theatreSeatService.getAvailableSeats(theatreId);

    }
    @GetMapping("/status/{theatreId}")

  public Map<String, Object> getTheatreStatus(@PathVariable Long theatreId){
        return theatreSeatService.getTheatreStatus(theatreId);
    }
}
