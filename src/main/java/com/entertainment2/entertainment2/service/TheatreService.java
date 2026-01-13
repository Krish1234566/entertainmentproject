package com.entertainment2.entertainment2.service;

import com.entertainment2.entertainment2.model.Theatre;

import java.util.List;

public interface TheatreService {
    Theatre addTheatre(Theatre theatre);

    List<Theatre> getAllTheatres();

    Theatre getTheatreById(Long id);

    Theatre updateTheatre(Long id, Theatre theatre);

    void deleteTheatre(Long id);
}
