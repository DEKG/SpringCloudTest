package com.wanghao.springcloudzuulserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author wanghao
 */
@EnableZuulProxy
@SpringBootApplication
public class SpringCloudZuulServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudZuulServerApplication.class, args);
    }
}
