package com.cpineda.backend.userapp.backenduserapp.model.dto.mapper;

import com.cpineda.backend.userapp.backenduserapp.model.dto.UserDto;
import com.cpineda.backend.userapp.backenduserapp.model.entites.User;

public class DtoMapperUser {

    private User user;

    private DtoMapperUser() {
    }

    public static DtoMapperUser builder() {
        return new DtoMapperUser();
    }

    public DtoMapperUser setUser(User user) {
        this.user = user;
        return this;
    }

    public UserDto build() {
        if(user == null){
            throw new RuntimeException("Debe pasar en entity user");
        }

        return new UserDto(user.getId(), user.getUsername(), user.getEmail());
    }

}
