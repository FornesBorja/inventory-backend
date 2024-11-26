package com.fornesb.inventory.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@NoArgsConstructor
@Data
@AllArgsConstructor
@ToString

public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer idProduct;
    String description;
    Double price;
    Integer stock;
}
