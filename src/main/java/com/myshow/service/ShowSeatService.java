package com.myshow.service;

import com.myshow.dto.ShowSeatResponseDto;

import java.util.List;

public interface ShowSeatService {

    void initializeShowSeats(String showId);

    List<ShowSeatResponseDto> getShowSeatsByShow(String showId);

    List<ShowSeatResponseDto> getAvailableSeatsByShow(String showId);

    void lockSeats(String showId, List<String> seatIds);

    void unlockSeats(String showId, List<String> seatIds);

    void confirmSeats(String showId, List<String> seatIds);

    Long countAvailableSeats(String showId);
}