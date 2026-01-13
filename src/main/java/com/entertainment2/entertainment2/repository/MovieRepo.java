package com.entertainment2.entertainment2.repository;

import com.entertainment2.entertainment2.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface MovieRepo extends JpaRepository<Movie,Long> {

}
