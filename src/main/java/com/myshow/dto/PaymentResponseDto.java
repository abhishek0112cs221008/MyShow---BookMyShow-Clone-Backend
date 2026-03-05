package com.myshow.dto;

import com.myshow.entity.enums.PaymentMethod;
import com.myshow.entity.enums.PaymentStatus;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PaymentResponseDto {

    private String id;

    private String bookingRef;

    private BigDecimal amount;

    private PaymentMethod method;

    private PaymentStatus status;

    private String gatewayOrderId;

    private String gatewayPaymentId;

    private LocalDateTime paidAt;

    private LocalDateTime createdAt;
}