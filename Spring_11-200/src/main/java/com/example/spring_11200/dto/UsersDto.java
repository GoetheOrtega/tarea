package com.example.spring_11200.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.example.spring_11200.models.User;

import java.util.List;
import java.util.stream.Collectors;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UsersDto {
    private Long id;
    private String email;

    public static UsersDto from(User user) {
        return UsersDto.builder()
                .id(user.getId())
                .email(user.getEmail())
                .build();
    }

    public static List<UsersDto> usersList(List<User> users) {
        return users.stream()
                .map(UsersDto::from)
                .collect(Collectors.toList());
    }
}
