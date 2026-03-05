package com.myshow.entity;

import com.myshow.entity.enums.CertRating;
import com.myshow.entity.enums.Genre;
import com.myshow.entity.enums.MovieStatus;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "movies")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(nullable = false)
    private String title;

    @Lob
    private String description;

    // stored as comma-separated in MySQL
    @ElementCollection
    @CollectionTable(name = "movie_languages")
    private List<String> languages;

    @ElementCollection
    @CollectionTable(name = "movie_genres")
    @Enumerated(EnumType.STRING)
    private List<Genre> genres;

    private Integer durationMinutes;

    @Enumerated(EnumType.STRING)
    private CertRating certRating;        // U, UA, A, S

    private LocalDate releaseDate;

    @Enumerated(EnumType.STRING)
    private MovieStatus status = MovieStatus.UPCOMING;

    private String posterUrl;             // S3 URL
    private String trailerUrl;
    private String director;

    @Lob
    private String castJson;              // JSON string: [{name, role, photo}]

    private Double avgRating = 0.0;

    @OneToMany(mappedBy = "movie")
    private List<Show> shows = new ArrayList<>();

    @OneToMany(mappedBy = "movie")
    private List<Review> reviews = new ArrayList<>();

}
