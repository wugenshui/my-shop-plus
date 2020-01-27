package com.chenbo.myshop.plus.configuration;

import com.chenbo.myshop.plus.interceptor.FeignRequestInterceptor;
import feign.RequestInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Feign 全局配置
 *
 * @author : chenbo
 * @date : 2020-01-27
 */
@Configuration
public class FeignRequestConfiguration {

    @Bean
    public RequestInterceptor requestInterceptor() {
        return new FeignRequestInterceptor();
    }

}