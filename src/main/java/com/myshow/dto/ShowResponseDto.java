package com.myshow.dto;

import com.myshow.entity.enums.ScreenType;
import com.myshow.entity.enums.ShowStatus;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ShowResponseDto {

    private String id;

    private String movieId;
    private String movieTitle;

    private String theatreId;
    private String theatreName;

    private String screenId;
    private String screenName;

    private LocalDateTime startTime;
    private LocalDateTime endTime;

    private String language;

    private ScreenType format;

    private ShowStatus status;

    private Integer totalSeats;
    private Integer availableSeats;
}