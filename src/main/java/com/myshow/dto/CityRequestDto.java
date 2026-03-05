package com.myshow.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CityRequestDto {

    @NotBlank(message = "City name is required")
    private String name;

    @NotBlank(message = "State name is required")
    private String state;

    private Boolean isActive = true;
}