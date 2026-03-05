package com.myshow.entity;

import com.myshow.entity.enums.PaymentMethod;
import com.myshow.entity.enums.PaymentStatus;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "payments")
public class Payment {
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "booking_id", unique = true)
    private Booking booking;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    private BigDecimal amount;

    @Enumerated(EnumType.STRING)
    private PaymentMethod method;         // CARD, UPI, WALLET, NETBANKING

    private String gatewayOrderId;        // Razorpay order_id
    private String gatewayPaymentId;      // Razorpay payment_id (after success)
    private String gatewaySignature;      // Razorpay signature

    @Enumerated(EnumType.STRING)
    private PaymentStatus status = PaymentStatus.PENDING;

    private LocalDateTime paidAt;
    private LocalDateTime createdAt = LocalDateTime.now();
}

