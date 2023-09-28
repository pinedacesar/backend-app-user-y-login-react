package com.cpineda.backend.userapp.backenduserapp.reposities;

import com.cpineda.backend.userapp.backenduserapp.model.entites.Role;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface RoleRepository extends CrudRepository<Role, Long>  {

    Optional<Role> findByName(String name);
}
