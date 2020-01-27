package com.chenbo.myshop.plus.configuration;

import com.alibaba.csp.sentinel.annotation.aspectj.SentinelResourceAspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 仅 Dubbo 服务需要该配置，Spring Cloud Alibaba 无需加载该配置
 *
 * @author : chenbo
 * @date : 2020-01-27
 */
@Configuration
public class DubboSentinelConfiguration {

    @Bean
    public SentinelResourceAspect sentinelResourceAspect() {
        return new SentinelResourceAspect();
    }

}