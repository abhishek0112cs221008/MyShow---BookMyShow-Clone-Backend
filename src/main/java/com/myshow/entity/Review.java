package com.myshow.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "reviews",
        uniqueConstraints = @UniqueConstraint(
                columnNames = {"user_id", "movie_id"}))
public class Review {
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "movie_id", nullable = false)
    private Movie movie;

    @Column(nullable = false)
    private Double rating;                // 1.0 to 10.0

    private String comment;
    private Boolean isVerifiedBooking = false;
    private LocalDateTime createdAt = LocalDateTime.now();
}
