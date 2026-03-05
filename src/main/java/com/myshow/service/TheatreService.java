package com.myshow.service;

import com.myshow.dto.TheatreRequestDto;
import com.myshow.dto.TheatreResponseDto;

import java.util.List;

public interface TheatreService {

    TheatreResponseDto addTheatre(TheatreRequestDto dto);

    TheatreResponseDto getTheatreById(String id);

    List<TheatreResponseDto> getTheatresByCity(String cityId);

    TheatreResponseDto updateTheatre(String id, TheatreRequestDto dto);

    void deleteTheatre(String id);

    List<TheatreResponseDto> getTheatresByMovieAndCity(String movieId, String cityId);
}