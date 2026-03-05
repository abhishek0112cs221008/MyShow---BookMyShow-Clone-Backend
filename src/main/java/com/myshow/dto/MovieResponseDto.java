package com.myshow.dto;

import com.myshow.entity.enums.CertRating;
import com.myshow.entity.enums.Genre;
import com.myshow.entity.enums.MovieStatus;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MovieResponseDto {

    private String id;

    private String title;

    private String description;

    private List<String> languages;

    private List<Genre> genres;

    private Integer durationMinutes;

    private CertRating certRating;

    private LocalDate releaseDate;

    private MovieStatus status;

    private String posterUrl;

    private String trailerUrl;

    private String director;

    private String castJson;

    private Double avgRating;
}