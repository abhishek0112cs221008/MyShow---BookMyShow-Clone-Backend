package com.myshow.service;

import com.myshow.dto.ScreenRequestDto;
import com.myshow.dto.ScreenResponseDto;

import java.util.List;

public interface ScreenService {

    ScreenResponseDto addScreen(ScreenRequestDto dto);

    ScreenResponseDto getScreenById(String id);

    List<ScreenResponseDto> getScreensByTheatre(String theatreId);

    ScreenResponseDto updateScreen(String id, ScreenRequestDto dto);

    void deleteScreen(String id);

    Long countScreensByTheatre(String theatreId);
}