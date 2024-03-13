package com.moisesdias.cursodespringboot.repositories;

import com.moisesdias.cursodespringboot.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
