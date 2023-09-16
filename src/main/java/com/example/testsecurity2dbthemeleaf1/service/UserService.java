package com.example.testsecurity2dbthemeleaf1.service;

import com.example.testsecurity2dbthemeleaf1.dto.UserDto;
import com.example.testsecurity2dbthemeleaf1.entity.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();
}
