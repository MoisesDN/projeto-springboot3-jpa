package com.moisesdias.cursodespringboot.repositories;

import com.moisesdias.cursodespringboot.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
