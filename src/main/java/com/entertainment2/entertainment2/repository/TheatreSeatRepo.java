package com.entertainment2.entertainment2.repository;

import com.entertainment2.entertainment2.model.TheatreSeat;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface TheatreSeatRepo extends JpaRepository<TheatreSeat,Long> {
    List<TheatreSeat> findAllByTheatreId(Long theatreId);

    long countByTheatreIdAndBookedFalse(Long theatreId);

    Optional<Object> findByTheatreIdAndBookedFalse(Long theatreId);
}
