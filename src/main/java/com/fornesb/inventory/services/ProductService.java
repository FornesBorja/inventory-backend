package com.fornesb.inventory.services;

import com.fornesb.inventory.model.Product;
import com.fornesb.inventory.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
 @Service
public class ProductService implements iProductService{
     @Autowired
     private ProductRepository ProductRepository;

    @Override
    public List<Product> listAllProducts() {
        return this.ProductRepository.findAll();
    }

    @Override
    public Product searchProductById(Integer idProduct) {
        return this.ProductRepository.findById(idProduct).orElse(null);
    }

    @Override
    public void saveProduct(Product product) {
        this.ProductRepository.save(product);
        System.out.println("Product saved successfully...");
    }

    @Override
    public void deleteProduct(Integer idProduct) {
        this.ProductRepository.deleteById(idProduct);
        System.out.println("Product deleted successfully...");
    }
}
