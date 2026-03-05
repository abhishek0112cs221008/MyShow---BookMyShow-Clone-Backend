package com.myshow.dto;

import com.myshow.entity.enums.SeatType;
import jakarta.validation.constraints.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SeatRequestDto {

    @NotBlank(message = "Screen ID is required")
    private String screenId;

    @NotBlank(message = "Row label is required")
    @Pattern(regexp = "^[A-Z]$", message = "Row label must be a single uppercase letter (A-Z)")
    private String rowLabel;

    @NotNull(message = "Seat number is required")
    @Min(value = 1, message = "Seat number must be greater than 0")
    private Integer seatNumber;

    @NotNull(message = "Seat type is required")
    private SeatType type;

    private Boolean isActive = true;
}