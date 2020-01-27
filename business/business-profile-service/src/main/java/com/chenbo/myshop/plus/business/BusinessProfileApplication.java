package com.chenbo.myshop.plus.business;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author : chenbo
 * @date : 2020-01-27
 */
@SpringBootApplication
@EnableDiscoveryClient
public class BusinessProfileApplication {

    public static void main(String[] args) {
        SpringApplication.run(BusinessProfileApplication.class, args);
    }

}