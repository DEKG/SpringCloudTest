package com.wanghao.springcloudribbonclient.controller;

import com.wanghao.springcloudribbonclient.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wanghao
 */
@RestController
public class RibbonController {

    final RibbonService ribbonService;

    @Autowired
    public RibbonController(RibbonService ribbonService) {
        this.ribbonService = ribbonService;
    }


    @RequestMapping("/getClientInfo")
    public String getClientInfo() {
        return ribbonService.getClientInfo();
    }

    @RequestMapping("/testZuul")
    public String testZull(){
        return "这是springCloudRibbonClient的服务接口";
    }
}
