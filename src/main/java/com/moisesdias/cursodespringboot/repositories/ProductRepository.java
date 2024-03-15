package com.moisesdias.cursodespringboot.repositories;

import com.moisesdias.cursodespringboot.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
