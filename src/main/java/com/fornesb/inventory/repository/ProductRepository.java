package com.fornesb.inventory.repository;

import com.fornesb.inventory.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository <Product, Integer>{
}
