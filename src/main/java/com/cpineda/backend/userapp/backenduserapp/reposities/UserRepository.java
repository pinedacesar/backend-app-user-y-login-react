package com.cpineda.backend.userapp.backenduserapp.reposities;

import com.cpineda.backend.userapp.backenduserapp.model.entites.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long>  {

}
