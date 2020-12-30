package com.wanghao.springcloudfeignclient.controller;

import com.wanghao.springcloudfeignclient.remote.FeignRemoteService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wanghao
 */
@RestController
public class FeignController {

    final
    FeignRemoteService feignRemoteService;

    public FeignController(FeignRemoteService feignRemoteService) {
        this.feignRemoteService = feignRemoteService;
    }

    @RequestMapping("/getClientInfo")
    public String getClientInfo(){
        return feignRemoteService.clientTest();
    }

    @RequestMapping("/testZuul")
    public String testZuul(){
        return "这是SpringCloudFeignClient的服务接口";
    }
}
