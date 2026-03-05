package com.myshow.entity;

import com.myshow.entity.enums.ScreenType;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "screens")
public class Screen {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "theatre_id", nullable = false)
    private Theatre theatre;

    private String name;                  // Screen 1, Audi 2...

    @Enumerated(EnumType.STRING)
    private ScreenType type;              // 2D, 3D, IMAX, 4DX

    private Integer totalCapacity;
    private Boolean isActive = true;

    @OneToMany(mappedBy = "screen", cascade = CascadeType.ALL)
    private List<Seat> seats = new ArrayList<>();
}
