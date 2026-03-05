package com.myshow.dto;

import com.myshow.entity.enums.BookingStatus;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BookingResponseDto {

    private String id;

    private String bookingRef;

    private String movieTitle;

    private String theatreName;

    private String screenName;

    private LocalDateTime showStartTime;

    private List<String> seats;

    private Integer numTickets;

    private BookingStatus status;

    private BigDecimal totalAmount;

    private BigDecimal convenienceFee;

    private BigDecimal gst;

    private BigDecimal discountAmount;

    private BigDecimal amountPaid;

    private String couponCode;

    private String qrCodeUrl;

    private LocalDateTime createdAt;
}