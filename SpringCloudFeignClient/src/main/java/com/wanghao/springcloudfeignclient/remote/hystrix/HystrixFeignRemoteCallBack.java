package com.wanghao.springcloudfeignclient.remote.hystrix;

import com.wanghao.springcloudfeignclient.remote.FeignRemoteService;
import org.springframework.stereotype.Component;

/**
 * @author wanghao
 */
@Component
public class HystrixFeignRemoteCallBack implements FeignRemoteService {
    @Override
    public String clientTest() {
        return "clientTest error";
    }
}
