package com.entertainment2.entertainment2.model;

import jakarta.persistence.*;
import lombok.Data;
@Entity
@Data
public class Booking {
    @Id
    private long id;
    private String customerName;
    private Integer numberOfTickets;


    @ManyToOne
    @JoinColumn(name = "showTime_id")
    private ShowTime showTime;
}
