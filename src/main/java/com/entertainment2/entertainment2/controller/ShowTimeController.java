package com.entertainment2.entertainment2.controller;

import com.entertainment2.entertainment2.model.ShowTime;
import com.entertainment2.entertainment2.service.ShowTimeService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ShowTimeController {
    @Autowired
    ShowTimeService showTimeService;

    @PostMapping("/addShow")
    public ShowTime addShowTime(@RequestBody ShowTime showTime){
        return showTimeService.addShowTime(showTime);
    }
    @GetMapping("/getShow")
    public List<ShowTime> getShow(@RequestParam("id") Long id){
        return  showTimeService.getShowTime(id);
    }


    @GetMapping("/movieById")
    public List<ShowTime> getShowTimesByMovie(@PathVariable Long movieId) {
        return showTimeService.getShowTimesByMovie(movieId);
    }


    @GetMapping("/theatreById")
    public List<ShowTime> getShowTimesByTheatre(@PathVariable Long theatreId) {
        return showTimeService.getShowTimesByTheatre(theatreId);
    }


   /* @GetMapping
    public List<ShowTime> getAllShowTimes() {
        return showTimeService.getAllShowTimes();
    }*/
}
