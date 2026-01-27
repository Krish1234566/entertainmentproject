package com.entertainment2.entertainment2.serviceimpl;

import com.entertainment2.entertainment2.model.Theatre;
import com.entertainment2.entertainment2.model.TheatreSeat;
import com.entertainment2.entertainment2.repository.TheatreRepo;
import com.entertainment2.entertainment2.service.TheatreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TheatreServiceImpl implements TheatreService {
@Autowired
    TheatreRepo theatreRepo;

    @Override
    public Theatre addTheatre(Theatre theatre) {
        return theatreRepo.save(theatre);
    }

    @Override
    public List<Theatre> getAllTheatres() {
         return theatreRepo.findAll();
    }

    @Override
    public Theatre getTheatreById(Long id) {
        return null;
    }

    @Override
    public Theatre updateTheatre(Long id, Theatre theatre) {
        return null;
    }

    @Override
    public void deleteTheatre(Long id) {

    }


}
