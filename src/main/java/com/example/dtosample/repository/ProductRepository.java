package com.example.dtosample.repository;

import com.example.dtosample.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface ProductRepository extends JpaRepository<Product, String> {
    List<Product> findByBrand(String brand);
}