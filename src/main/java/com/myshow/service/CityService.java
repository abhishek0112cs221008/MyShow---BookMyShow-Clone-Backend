package com.myshow.service;

import com.myshow.dto.CityRequestDto;
import com.myshow.dto.CityResponseDto;

import java.util.List;

public interface CityService {

    CityResponseDto addCity(CityRequestDto dto);

    CityResponseDto getCityById(String id);

    List<CityResponseDto> getAllActiveCities();

    CityResponseDto updateCity(String id, CityRequestDto dto);

    void deactivateCity(String id);
}