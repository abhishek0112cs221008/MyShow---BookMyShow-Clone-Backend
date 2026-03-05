package com.myshow.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CityResponseDto {

    private String id;

    private String name;

    private String state;

    private Boolean isActive;
}