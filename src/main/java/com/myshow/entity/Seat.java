package com.myshow.entity;

import com.myshow.entity.enums.SeatType;
import jakarta.persistence.*;

@Entity
@Table(name = "seats",
        uniqueConstraints = @UniqueConstraint(
                columnNames = {"screen_id", "row_label", "seat_number"}))
public class Seat {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "screen_id", nullable = false)
    private Screen screen;

    private String rowLabel;              // A, B, C, D...
    private Integer seatNumber;           // 1, 2, 3...

    @Enumerated(EnumType.STRING)
    private SeatType type;               // SILVER, GOLD, PLATINUM

    private Boolean isActive = true;
}
