package com.myshow.dto;

import jakarta.validation.constraints.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TheatreRequestDto {

    @NotBlank(message = "Theatre name is required")
    private String name;

    @NotBlank(message = "City ID is required")
    private String cityId;

    @NotBlank(message = "Address is required")
    private String address;

    @NotBlank(message = "Pincode is required")
    @Pattern(regexp = "^[0-9]{6}$", message = "Pincode must be 6 digits")
    private String pincode;

    @NotNull(message = "Latitude is required")
    private Double latitude;

    @NotNull(message = "Longitude is required")
    private Double longitude;

    private Boolean isActive = true;

    private List<String> amenities;
}