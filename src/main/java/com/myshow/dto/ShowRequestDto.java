package com.myshow.dto;

import com.myshow.entity.enums.ScreenType;
import com.myshow.entity.enums.ShowStatus;
import jakarta.validation.constraints.*;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ShowRequestDto {

    @NotBlank(message = "Movie ID is required")
    private String movieId;

    @NotBlank(message = "Screen ID is required")
    private String screenId;

    @NotBlank(message = "Theatre ID is required")
    private String theatreId;

    @NotNull(message = "Start time is required")
    private LocalDateTime startTime;

    @NotNull(message = "End time is required")
    private LocalDateTime endTime;

    @NotBlank(message = "Language is required")
    private String language;

    @NotNull(message = "Screen format is required")
    private ScreenType format;

    private ShowStatus status = ShowStatus.ACTIVE;

    @NotNull(message = "Total seats required")
    @Min(value = 1, message = "Total seats must be greater than 0")
    private Integer totalSeats;

    @NotNull(message = "Available seats required")
    @Min(value = 0, message = "Available seats cannot be negative")
    private Integer availableSeats;
}