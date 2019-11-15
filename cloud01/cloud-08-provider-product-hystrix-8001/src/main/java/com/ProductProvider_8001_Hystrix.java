package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@MapperScan("com.dj.mapper") //扫描所有Mapper接口
@SpringBootApplication
@EnableEurekaClient
@EnableHystrix//开启 Hystrix 熔断机制的支持
public class ProductProvider_8001_Hystrix {
    public static void main(String[] args) {
        SpringApplication.run(ProductProvider_8001_Hystrix.class, args);
    }
}
