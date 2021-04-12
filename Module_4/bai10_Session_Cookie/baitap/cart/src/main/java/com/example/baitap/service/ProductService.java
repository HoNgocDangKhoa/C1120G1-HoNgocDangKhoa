package com.example.baitap.service;

import com.example.baitap.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAllProduct();

    Product findById(Integer id);

    void save(Product product);

    void remove(Integer id);
}
