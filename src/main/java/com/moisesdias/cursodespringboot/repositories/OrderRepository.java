package com.moisesdias.cursodespringboot.repositories;

import com.moisesdias.cursodespringboot.entities.Order;
import com.moisesdias.cursodespringboot.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
