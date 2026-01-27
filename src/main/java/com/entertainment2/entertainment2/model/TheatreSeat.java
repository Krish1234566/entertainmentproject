package com.entertainment2.entertainment2.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter
@Getter
@Entity
public class TheatreSeat {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
