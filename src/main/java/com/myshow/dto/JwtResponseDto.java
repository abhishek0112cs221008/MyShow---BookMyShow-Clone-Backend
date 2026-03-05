package com.myshow.dto;

import com.myshow.entity.enums.Role;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class JwtResponseDto {

    private String token;

    private String type = "Bearer";

    private String userId;

    private String name;

    private String email;

    private Role role;
}