package com.myshow.dto;

import jakarta.validation.constraints.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ReviewRequestDto {

    @NotBlank(message = "User ID is required")
    private String userId;

    @NotBlank(message = "Movie ID is required")
    private String movieId;

    @NotNull(message = "Rating is required")
    @DecimalMin(value = "1.0", message = "Rating must be at least 1")
    @DecimalMax(value = "10.0", message = "Rating cannot exceed 10")
    private Double rating;

    @Size(max = 500, message = "Comment cannot exceed 500 characters")
    private String comment;
}