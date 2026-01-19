package com.entertainment2.entertainment2.serviceimpl;

import com.entertainment2.entertainment2.model.ShowTime;
import com.entertainment2.entertainment2.repository.ShowTimeRepo;
import com.entertainment2.entertainment2.service.ShowTimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShowTimeServiceImpl implements ShowTimeService {

    @Autowired
    ShowTimeRepo showTimeRepo;

    @Override
    public ShowTime addShowTime(ShowTime showTime) {
       try{
           if(showTime.getTime() != null){
              return showTimeRepo.save(showTime);
           }else {
               return new ShowTime();
           }
       }catch (Exception e){
           throw new RuntimeException("something occured "+ e.getMessage());
       }
    }

    @Override
    public List<ShowTime> getShowTime(Long id) {
        return showTimeRepo.getShows(id);
    }

    @Override
    public List<ShowTime> getShowTimesByMovie(Long movieId) {
        return List.of();
    }

    @Override
    public List<ShowTime> getShowTimesByTheatre(Long theatreId) {
        return List.of();
    }

    @Override
    public List<ShowTime> getAllShowTimes() {
        return List.of();
    }

    @Override
    public List<ShowTime> getShowTimesByBookingId(Long bookingId) {
        return List.of();
    }
}
