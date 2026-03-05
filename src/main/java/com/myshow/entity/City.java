package com.myshow.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "cities")
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String name;
    private String state;
    private Boolean isActive = true;

    @OneToMany(mappedBy = "city")
    private List<Theatre> theatres = new ArrayList<>();
}

