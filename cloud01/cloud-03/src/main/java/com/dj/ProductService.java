package com.dj;

import com.Product;

import java.util.List;

public interface ProductService {
    boolean add(Product product);
    Product get(Long id);
    List<Product> list();
}