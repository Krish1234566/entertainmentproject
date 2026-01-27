package com.entertainment2.entertainment2.repository;

import com.entertainment2.entertainment2.model.ShowTime;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShowTimeRepo extends JpaRepository<ShowTime,Long>{
    @Query("select s from ShowTime s where s.id = :id")
    public List<ShowTime> getShows(@Param("id") Long id );


   List<ShowTime> findByMovieId(Long movieId);

    List<ShowTime> findByTheatreId(Long theatreId);


}