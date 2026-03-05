package com.myshow.dto;

import com.myshow.entity.enums.ScreenType;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ScreenResponseDto {

    private String id;

    private String theatreId;

    private String theatreName;

    private String name;

    private ScreenType type;

    private Integer totalCapacity;

    private Boolean isActive;
}