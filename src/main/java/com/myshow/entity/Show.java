package com.myshow.entity;
import com.myshow.entity.enums.ScreenType;
import com.myshow.entity.enums.ShowStatus;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "shows")
public class Show {
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "movie_id", nullable = false)
    private Movie movie;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "screen_id", nullable = false)
    private Screen screen;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "theatre_id", nullable = false)
    private Theatre theatre;

    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private String language;

    @Enumerated(EnumType.STRING)
    private ScreenType format;

    @Enumerated(EnumType.STRING)
    private ShowStatus status = ShowStatus.ACTIVE;

    private Integer totalSeats;
    private Integer availableSeats;

    @OneToMany(mappedBy = "show", cascade = CascadeType.ALL)
    private List<ShowSeat> showSeats = new ArrayList<>();

    @OneToMany(mappedBy = "show", cascade = CascadeType.ALL)
    private List<PriceTier> priceTiers = new ArrayList<>();
}
