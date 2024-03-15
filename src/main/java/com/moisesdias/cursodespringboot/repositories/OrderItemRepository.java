package com.moisesdias.cursodespringboot.repositories;

import com.moisesdias.cursodespringboot.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
