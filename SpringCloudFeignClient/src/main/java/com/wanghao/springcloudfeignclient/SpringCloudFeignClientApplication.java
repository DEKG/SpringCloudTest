package com.wanghao.springcloudfeignclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author wanghao
 */
@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class SpringCloudFeignClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudFeignClientApplication.class, args);
    }
}
