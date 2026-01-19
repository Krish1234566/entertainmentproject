package com.entertainment2.entertainment2.serviceimpl;

import com.entertainment2.entertainment2.model.Movie;
import com.entertainment2.entertainment2.repository.MovieRepo;
import com.entertainment2.entertainment2.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MovieServiceImpl implements MovieService {


  @Autowired
    MovieRepo movieRepo;

    public Movie addMovie(Movie movie) {
        return movieRepo.save(movie);
    }



    @Override
    public Optional<Object> getMovieById(Long id) {
        return Optional.empty();
    }

    @Override
    public Movie updateMovie(Long id, Movie movieDetails) {
        return null;
    }

    @Override
    public Movie getAllMovies() {
        return null;
    }

    @Override
    public void deleteMovie(Long id) {

    }

}
