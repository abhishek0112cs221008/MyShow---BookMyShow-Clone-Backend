package com.myshow.dto;

import com.myshow.entity.enums.CouponType;
import jakarta.validation.constraints.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CouponRequestDto {

    @NotBlank(message = "Coupon code is required")
    private String code;

    @NotNull(message = "Coupon type is required")
    private CouponType type;

    @NotNull(message = "Discount value is required")
    @DecimalMin(value = "0.01", message = "Discount must be greater than 0")
    private BigDecimal discountValue;

    private BigDecimal maxDiscount;

    @NotNull(message = "Minimum order value is required")
    @DecimalMin(value = "0.0", message = "Minimum order value cannot be negative")
    private BigDecimal minOrderValue;

    @NotNull(message = "Usage limit is required")
    @Min(value = 1, message = "Usage limit must be at least 1")
    private Integer usageLimit;

    @NotNull(message = "Valid from date is required")
    private LocalDateTime validFrom;

    @NotNull(message = "Valid until date is required")
    private LocalDateTime validUntil;

    private Boolean isActive = true;
}