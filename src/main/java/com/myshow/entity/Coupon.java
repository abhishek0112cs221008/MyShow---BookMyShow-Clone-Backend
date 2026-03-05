package com.myshow.entity;

import com.myshow.entity.enums.CouponType;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "coupons")
public class Coupon {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(unique = true, nullable = false)
    private String code;                  // e.g. SHOW200

    @Enumerated(EnumType.STRING)
    private CouponType type;              // PERCENT or FLAT

    private BigDecimal discountValue;     // e.g. 20 (%) or 200 (flat Rs)
    private BigDecimal maxDiscount;       // cap for PERCENT type (nullable)
    private BigDecimal minOrderValue;     // minimum cart value to apply
    private Integer usageLimit;           // max total uses
    private Integer usedCount = 0;
    private LocalDateTime validFrom;
    private LocalDateTime validUntil;
    private Boolean isActive = true;
}
