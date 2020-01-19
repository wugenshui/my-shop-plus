package com.chenbo.myshop.plus.business.service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : chenbo
 * @date : 2020-01-19
 */
@RestController
@RequestMapping(value = "echo")
public class EchoController {
    //@Reference(version = "1.0.0")
    //private EchoService echoService;

    @GetMapping(value = "{string}")
    public String echo(@PathVariable String string) {
        return "123"+string;
        //return echoService.echo(string);
    }
}
