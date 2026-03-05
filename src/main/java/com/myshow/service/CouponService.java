package com.myshow.service;

import com.myshow.dto.CouponRequestDto;
import com.myshow.dto.CouponResponseDto;

import java.math.BigDecimal;
import java.util.List;

public interface CouponService {

    CouponResponseDto createCoupon(CouponRequestDto dto);

    CouponResponseDto getCouponByCode(String code);

    Boolean validateCoupon(String code);

    BigDecimal applyCoupon(String code, BigDecimal amount);

    void deactivateCoupon(String id);

    List<CouponResponseDto> getAllValidCoupons();
}