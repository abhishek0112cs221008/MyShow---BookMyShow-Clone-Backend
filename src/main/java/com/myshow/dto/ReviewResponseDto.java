package com.myshow.dto;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ReviewResponseDto {

    private String id;

    private String userId;

    private String userName;

    private String movieId;

    private Double rating;

    private String comment;

    private Boolean isVerifiedBooking;

    private LocalDateTime createdAt;
}