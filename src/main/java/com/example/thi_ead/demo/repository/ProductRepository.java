package com.example.thi_ead.demo.repository;

import com.example.thiead.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
