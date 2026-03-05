package com.myshow.entity;
import com.myshow.entity.enums.SeatStatus;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "show_seats",
        uniqueConstraints = @UniqueConstraint(
                columnNames = {"show_id", "seat_id"}))
public class ShowSeat {
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "show_id", nullable = false)
    private Show show;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "seat_id", nullable = false)
    private Seat seat;

    @Enumerated(EnumType.STRING)
    private SeatStatus status = SeatStatus.AVAILABLE;

    private BigDecimal price;

    // Locking fields
    private LocalDateTime lockedAt;
    private String lockedByUserId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "booking_id")
    private Booking booking;              // set only after payment confirmed
}
