package com.entertainment2.entertainment2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Movie {
    @Id
    private long id;
    private String title;

    private String genre;

    private Integer duration;
}
