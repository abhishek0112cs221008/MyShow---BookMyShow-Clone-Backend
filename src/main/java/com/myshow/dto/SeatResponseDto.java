package com.myshow.dto;

import com.myshow.entity.enums.SeatType;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SeatResponseDto {

    private String id;

    private String screenId;

    private String screenName;

    private String rowLabel;

    private Integer seatNumber;

    private SeatType type;

    private Boolean isActive;
}