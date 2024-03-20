package com.example.ormlab1.dao.repositories;

import com.example.ormlab1.dao.entitie.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
