package com.ttn.Bootcamp22project.repos;

import com.ttn.Bootcamp22project.entities.user.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<User, Integer> {

    User findByEmail(String username);
}
