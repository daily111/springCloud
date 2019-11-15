package com.dj.test;

import com.Product;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component //不要少了
public class ProductClientServiceFallBack implements ProductClientService {
    @Override
    public Product get(Long id) {
        return new Product(id, "id="+ id + "无数据--feign&hystrix", "无有效数据库");
    }
    @Override
    public List<Product> list() {
        List<Product> list=new ArrayList<>();
        list.add(new Product(9999L,  "无数据--feign&hystrix", "无有效数据库"));
        return list;
    }
    @Override
    public boolean add(Product product) {
        return false;
    }
}