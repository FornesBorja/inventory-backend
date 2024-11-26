package com.fornesb.inventory.services;

import com.fornesb.inventory.model.Product;

import java.util.List;

public interface iProductService {
    public List<Product> listProducts();

    public Product searchProductById(Integer idProduct);

    public void saveProduct (Product product);

    public void deleteProduct (Product product);
}
