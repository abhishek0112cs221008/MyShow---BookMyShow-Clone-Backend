package com.myshow.service;

import com.myshow.dto.SeatRequestDto;
import com.myshow.dto.SeatResponseDto;
import com.myshow.entity.enums.SeatType;

import java.util.List;

public interface SeatService {

    SeatResponseDto addSeat(SeatRequestDto dto);

    SeatResponseDto getSeatById(String id);

    List<SeatResponseDto> getSeatsByScreen(String screenId);

    List<SeatResponseDto> getSeatsByScreenAndType(String screenId, SeatType type);

    void deleteSeat(String id);

    Long countSeatsByScreen(String screenId);
}