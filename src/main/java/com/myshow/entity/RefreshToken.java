package com.myshow.entity;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "refresh_tokens")
public class RefreshToken {
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(nullable = false)
    private String token;                 // SHA-256 hashed token

    private LocalDateTime expiresAt;
    private Boolean isRevoked = false;
    private String deviceInfo;            // optional: device identifier
    private LocalDateTime createdAt = LocalDateTime.now();
}
