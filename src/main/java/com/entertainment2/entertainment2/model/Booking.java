package com.entertainment2.entertainment2.model;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
public class Booking {
    private long id;
    private String customerName;
    private Integer numberOfTickets;


    @ManyToOne
    @JoinColumn(name = "showTime_id")
    private ShowTime showTime;
}
