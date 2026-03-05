package com.myshow.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "theatres")
public class Theatre {
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "city_id", nullable = false)
    private City city;

    private String address;
    private String pincode;
    private Double latitude;
    private Double longitude;
    private Boolean isActive = true;

    @ElementCollection
    @CollectionTable(name = "theatre_amenities")
    private List<String> amenities;       // Parking, Food, ATVM...

    @OneToMany(mappedBy = "theatre", cascade = CascadeType.ALL)
    private List<Screen> screens = new ArrayList<>();
}

