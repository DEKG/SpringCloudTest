package com.wanghao.springcloudeurekaclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wanghao
 */
@RestController
public class TestController {

    @Value("${server.port}")
    String port;

    @RequestMapping("/clientTest")
    public String clientTest() {
        return "eureka client start up success。 port:" + port;
    }
}
