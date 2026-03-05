package com.myshow.dto;

import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TheatreResponseDto {

    private String id;

    private String name;

    private String cityName;

    private String address;

    private String pincode;

    private Double latitude;

    private Double longitude;

    private Boolean isActive;

    private List<String> amenities;
}