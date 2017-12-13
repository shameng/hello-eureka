package com.meng.helloeureka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xindemeng
 * @datetime 2017/12/14 0:46
 */
@RestController
public class HelloController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping("/hello")
    public String hello() {
        ServiceInstance instance = discoveryClient.getLocalServiceInstance();
        System.out.println(instance.getHost());
        return "hello, SpringBoot-dev";
    }
}
