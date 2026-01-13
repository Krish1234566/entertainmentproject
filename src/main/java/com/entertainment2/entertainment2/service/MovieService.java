package com.entertainment2.entertainment2.service;

import com.entertainment2.entertainment2.model.Movie;
import jakarta.persistence.Id;

import java.util.Optional;

public interface MovieService {

    Movie addMovie(Movie movie);



    Movie addNewMovie(Movie movie);

    Optional<Object> getMovieById(Long id);

    Movie updateMovie(Long id, Movie movie);

    Movie getAllMovies();

    void deleteMovie(Long id);


    //  Movie deleteMovie(Movie movie);
}
