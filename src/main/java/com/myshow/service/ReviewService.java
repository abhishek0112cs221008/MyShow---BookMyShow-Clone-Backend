package com.myshow.service;

import com.myshow.dto.ReviewRequestDto;
import com.myshow.dto.ReviewResponseDto;

import java.util.List;

public interface ReviewService {

    ReviewResponseDto addReview(ReviewRequestDto dto);

    List<ReviewResponseDto> getReviewsByMovie(String movieId);

    List<ReviewResponseDto> getReviewsByUser(String userId);

    ReviewResponseDto updateReview(String id, ReviewRequestDto dto);

    void deleteReview(String id);

    Double getAverageRating(String movieId);
}