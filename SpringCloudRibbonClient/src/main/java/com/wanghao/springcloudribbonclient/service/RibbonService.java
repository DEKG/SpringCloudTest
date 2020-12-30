package com.wanghao.springcloudribbonclient.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author wanghao
 */
@Service
public class RibbonService {

    final RestTemplate restTemplate;

    @Autowired
    public RibbonService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String getClientInfo() {
        return restTemplate.getForObject("http://springCloudEurekaClient/clientTest", String.class);
    }
}
