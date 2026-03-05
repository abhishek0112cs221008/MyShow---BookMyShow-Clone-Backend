package com.myshow.dto;

import com.myshow.entity.enums.Role;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserResponseDto {

    private String id;
    private String name;
    private String email;
    private String phone;
    private Role role;
    private Boolean verified;
    private String profilePic;
    private LocalDate dob;
    private String city;
}