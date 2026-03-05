package com.myshow.dto;

import com.myshow.entity.enums.ScreenType;
import jakarta.validation.constraints.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ScreenRequestDto {

    @NotBlank(message = "Theatre ID is required")
    private String theatreId;

    @NotBlank(message = "Screen name is required")
    private String name;

    @NotNull(message = "Screen type is required")
    private ScreenType type;

    @NotNull(message = "Total capacity is required")
    @Min(value = 1, message = "Total capacity must be greater than 0")
    private Integer totalCapacity;

    private Boolean isActive = true;
}