package com.wanghao.springcloudfeignclient.remote;

import com.wanghao.springcloudfeignclient.remote.hystrix.HystrixFeignRemoteCallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author wanghao
 */
@FeignClient(value = "springCloudEurekaClient", fallback = HystrixFeignRemoteCallBack.class)
public interface FeignRemoteService {

    /**
     * eurekaClient测试
     *
     * @return string
     */
    @RequestMapping("/clientTest")
    public String clientTest();
}
