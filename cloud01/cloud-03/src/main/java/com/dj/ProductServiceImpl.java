package com.dj;

import com.Product;
import com.dj.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * @Auther: 梦学谷
 */
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductMapper productMapper;
    @Override
    public boolean add(Product product) {
        return productMapper.addProduct(product);
    }
    @Override
    public Product get(Long id) {
        return productMapper.findById(id);
    }
    @Override
    public List<Product> list() {
        return productMapper.findAll();
    }
}
