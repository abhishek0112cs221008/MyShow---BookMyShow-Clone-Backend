package com.myshow.repository;

import com.myshow.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends JpaRepository<Movie, String> {
    List<Movie> findByTitleContainingIgnoreCase(String title);

    List<Movie> findByLanguages(String language);

    List<Movie> findByGenres(String genre);
}
