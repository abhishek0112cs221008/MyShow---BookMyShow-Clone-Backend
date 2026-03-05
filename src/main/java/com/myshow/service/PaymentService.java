package com.myshow.service;

import com.myshow.dto.PaymentResponseDto;

import java.util.List;

public interface PaymentService {

    PaymentResponseDto initiatePayment(String bookingId);

    PaymentResponseDto confirmPayment(String transactionId);

    PaymentResponseDto getPaymentByBooking(String bookingId);

    List<PaymentResponseDto> getPaymentsByUser(String userId);

    void refundPayment(String paymentId);
}