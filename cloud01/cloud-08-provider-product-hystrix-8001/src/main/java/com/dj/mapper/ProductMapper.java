package com.dj.mapper;

import com.Product;

import java.util.List;

/**
 * @Auther: 梦学谷
 */
//@Mapper //或在主启动类上使用@MapperScan注解
public interface ProductMapper {
    Product findById(Long pid);
    List<Product> findAll();
    boolean addProduct(Product product);
}
