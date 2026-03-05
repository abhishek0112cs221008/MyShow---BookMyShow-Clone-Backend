package com.myshow.service;

import com.myshow.dto.BookingRequestDto;
import com.myshow.dto.BookingResponseDto;

import java.math.BigDecimal;
import java.util.List;

public interface BookingService {

    BookingResponseDto createBooking(BookingRequestDto dto);

    BookingResponseDto getBookingById(String id);

    BookingResponseDto getBookingByReference(String reference);

    List<BookingResponseDto> getBookingsByUser(String userId);

    BookingResponseDto confirmBooking(String id);

    void cancelBooking(String id);

    void expirePendingBookings();

    BigDecimal getTotalRevenueByShow(String showId);
}