package com.myshow.entity;
import com.myshow.entity.enums.SeatType;
import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "price_tiers")
public class PriceTier {
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "show_id", nullable = false)
    private Show show;

    @Enumerated(EnumType.STRING)
    private SeatType seatType;            // SILVER, GOLD, PLATINUM

    private BigDecimal price;
    private Integer totalSeats;
    private Integer availableSeats;
}
