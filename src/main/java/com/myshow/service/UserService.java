package com.myshow.service;

import com.myshow.dto.UserRequestDto;
import com.myshow.dto.UserResponseDto;

import java.util.List;

public interface UserService {

    UserResponseDto registerUser(UserRequestDto dto);

    UserResponseDto getUserById(String id);

    UserResponseDto getUserByEmail(String email);

    UserResponseDto updateUser(String id, UserRequestDto dto);

    void deleteUser(String id);

    List<UserResponseDto> getAllUsers();

    void changePassword(String userId, String oldPassword, String newPassword);
}