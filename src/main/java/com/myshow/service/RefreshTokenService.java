package com.myshow.service;

import com.myshow.entity.RefreshToken;

public interface RefreshTokenService {

    RefreshToken createRefreshToken(String userId);

    boolean validateRefreshToken(String token);

    RefreshToken getByUserId(String userId);

    void deleteByUserId(String userId);

    void deleteExpiredTokens();
}