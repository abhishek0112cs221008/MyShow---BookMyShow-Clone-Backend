package com.myshow.service;

import com.myshow.dto.ShowRequestDto;
import com.myshow.dto.ShowResponseDto;

import java.time.LocalDate;
import java.util.List;

public interface ShowService {

    ShowResponseDto createShow(ShowRequestDto dto);

    ShowResponseDto getShowById(String id);

    List<ShowResponseDto> getShowsByMovie(String movieId);

    List<ShowResponseDto> getShowsByTheatreAndDate(String theatreId, LocalDate date);

    List<ShowResponseDto> getShowsByMovieAndCityAndDate(String movieId, String cityId, LocalDate date);

    List<ShowResponseDto> getUpcomingShows();

    ShowResponseDto updateShow(String id, ShowRequestDto dto);

    void cancelShow(String id);
}