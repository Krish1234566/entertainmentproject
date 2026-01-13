package com.entertainment2.entertainment2.controller;

import com.entertainment2.entertainment2.model.Theatre;
import com.entertainment2.entertainment2.service.TheatreService;
import com.entertainment2.entertainment2.serviceimpl.TheatreServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TheatreController {
    @Autowired
    TheatreService theatreService;
    @PostMapping("/addTheatre")
    public Theatre addTheatre(@RequestBody Theatre theatre){
        return theatreService.addTheatre(theatre);

    }
    @GetMapping
    public List<Theatre> getAllTheatres() {
        return theatreService.getAllTheatres();
    }
    @GetMapping("/id")
    public Theatre getTheatreById(@PathVariable Long id) {
        return theatreService.getTheatreById(id);
    }
    @PutMapping("/update")
    public Theatre updateTheatre(@PathVariable Long id, @RequestBody Theatre theatre) {
        return theatreService.updateTheatre(id, theatre);
    }
    @DeleteMapping("/delete")
    public void deleteTheatre(@PathVariable Long id) {
        theatreService.deleteTheatre(id);
    }
}
