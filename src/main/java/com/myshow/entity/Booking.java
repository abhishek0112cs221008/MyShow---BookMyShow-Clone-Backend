package com.myshow.entity;
import com.myshow.entity.enums.BookingStatus;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "bookings")
public class Booking {
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(unique = true, nullable = false)
    private String bookingRef;            // e.g. MS20241015XYZ

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "show_id", nullable = false)
    private Show show;

    @Enumerated(EnumType.STRING)
    private BookingStatus status = BookingStatus.PENDING;

    private BigDecimal totalAmount;       // base price total
    private BigDecimal convenienceFee;    // platform fee
    private BigDecimal gst;              // 18% on convenience fee
    private BigDecimal discountAmount;   // from coupon (0 if no coupon)
    private BigDecimal amountPaid;        // final amount charged

    private Integer numTickets;
    private String qrCodeUrl;             // S3 URL of QR image
    private String couponCode;            // applied coupon (nullable)

    private LocalDateTime createdAt = LocalDateTime.now();

    @OneToOne(mappedBy = "booking", cascade = CascadeType.ALL)
    private Payment payment;

    @OneToMany(mappedBy = "booking")
    private List<ShowSeat> seats = new ArrayList<>();
}
