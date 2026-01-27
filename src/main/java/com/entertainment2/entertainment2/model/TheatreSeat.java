package com.entertainment2.entertainment2.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class TheatreSeat {
    @Id
    private Long id;

    @Column(name = "theatre_id")
    private Long theatreId;

    @Column(name = "totalSeats")
    private Integer totalSeats;

    @Column(name = "seatNumber")
    private String seatNumber;
    private Boolean booked = false;

}
