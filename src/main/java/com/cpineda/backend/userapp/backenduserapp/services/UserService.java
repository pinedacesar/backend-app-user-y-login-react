package com.cpineda.backend.userapp.backenduserapp.services;

import com.cpineda.backend.userapp.backenduserapp.model.dto.UserDto;
import com.cpineda.backend.userapp.backenduserapp.model.entites.User;
import com.cpineda.backend.userapp.backenduserapp.model.request.UserRequest;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<UserDto> findAll();

    Optional<UserDto> findById(Long id);

    UserDto save(User user);

    Optional<UserDto> update(UserRequest user, Long id);

    void remove(Long id);
}
