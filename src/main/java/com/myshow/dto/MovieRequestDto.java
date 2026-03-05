package com.myshow.dto;

import com.myshow.entity.enums.CertRating;
import com.myshow.entity.enums.Genre;
import com.myshow.entity.enums.MovieStatus;
import jakarta.validation.constraints.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MovieRequestDto {

    @NotBlank(message = "Movie title is required")
    private String title;

    @NotBlank(message = "Description is required")
    private String description;

    @NotEmpty(message = "At least one language is required")
    private List<String> languages;

    @NotEmpty(message = "At least one genre is required")
    private List<Genre> genres;

    @NotNull(message = "Duration is required")
    @Min(value = 1, message = "Duration must be greater than 0")
    private Integer durationMinutes;

    @NotNull(message = "Certification rating is required")
    private CertRating certRating;

    @NotNull(message = "Release date is required")
    private LocalDate releaseDate;

    private MovieStatus status;

    @NotBlank(message = "Poster URL is required")
    private String posterUrl;

    private String trailerUrl;

    @NotBlank(message = "Director name is required")
    private String director;

    @NotBlank(message = "Cast information is required")
    private String castJson;
}