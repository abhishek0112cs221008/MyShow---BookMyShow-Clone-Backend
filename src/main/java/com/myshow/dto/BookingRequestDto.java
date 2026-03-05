package com.myshow.dto;

import jakarta.validation.constraints.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BookingRequestDto {

    @NotBlank(message = "User ID is required")
    private String userId;

    @NotBlank(message = "Show ID is required")
    private String showId;

    @NotEmpty(message = "At least one seat must be selected")
    private List<String> seatIds;

    private String couponCode;
}