package com.myshow.dto;

import com.myshow.entity.enums.CouponType;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CouponResponseDto {

    private String id;

    private String code;

    private CouponType type;

    private BigDecimal discountValue;

    private BigDecimal maxDiscount;

    private BigDecimal minOrderValue;

    private Integer usageLimit;

    private Integer usedCount;

    private LocalDateTime validFrom;

    private LocalDateTime validUntil;

    private Boolean isActive;
}