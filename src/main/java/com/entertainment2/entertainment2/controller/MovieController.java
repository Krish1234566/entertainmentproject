package com.entertainment2.entertainment2.controller;


import com.entertainment2.entertainment2.model.Movie;
import com.entertainment2.entertainment2.service.MovieService;
import com.entertainment2.entertainment2.serviceimpl.MovieServiceImpl;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/Movies")
public class MovieController {
    @Autowired
    MovieService movieService;


    @PostMapping("/addMovie")


    public Movie addMovie(@RequestBody Movie movie) {
        return movieService.addMovie(movie);

    }

    @GetMapping("/getAllMovies")
        List<Movie> getAllMovies() {
            return Collections.singletonList(movieService.getAllMovies());
        }

        @GetMapping("/{id}")
        public Optional<Object> getMovieById(@PathVariable Long id) {
            return movieService.getMovieById(id);
        }

    @DeleteMapping("/{id}")
    public void deleteMovie(@PathVariable Long id) {
        movieService.deleteMovie(id);
    }

    @PutMapping("/{id}")
    public Movie updateMovie(@PathVariable Long id, @RequestBody Movie movie) {
        return movieService.updateMovie(id, movie);
    }


}
