package com.myshow.service;

import com.myshow.dto.MovieRequestDto;
import com.myshow.dto.MovieResponseDto;

import java.util.List;

public interface MovieService {

    MovieResponseDto addMovie(MovieRequestDto dto);

    MovieResponseDto getMovieById(String id);

    List<MovieResponseDto> getAllMovies();

    MovieResponseDto updateMovie(String id, MovieRequestDto dto);

    void deleteMovie(String id);

    List<MovieResponseDto> searchByTitle(String title);

    List<MovieResponseDto> getMoviesByLanguage(String language);

    List<MovieResponseDto> getMoviesByGenre(String genre);

    List<MovieResponseDto> getNowPlayingByCity(String cityId);

    List<MovieResponseDto> getTopRatedMovies();
}