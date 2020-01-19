package com.chenbo.myshop.plus.provider.service;

import com.chenbo.myshop.plus.provider.api.EchoService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @author : chenbo
 * @date : 2020-01-19
 */
@Service(version = "1.0.0")
public class EchoServiceImpl implements EchoService {
    @Override
    public String echo(String string) {
        return "Hello Dubbo" + string;
    }
}
