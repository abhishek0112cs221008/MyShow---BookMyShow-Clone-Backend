package com.myshow.dto;

import com.myshow.entity.enums.SeatType;
import com.myshow.entity.enums.SeatStatus;
import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ShowSeatResponseDto {

    private String id;

    private String showId;

    private String seatId;

    private String rowLabel;

    private Integer seatNumber;

    private SeatType seatType;

    private SeatStatus status;

    private BigDecimal price;
}