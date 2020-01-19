package com.chenbo.myshop.plus.provider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.chenbo.myshop.plus.provider.service.mapper")
public class ProviderAdminServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderAdminServiceApplication.class, args);
    }

}
