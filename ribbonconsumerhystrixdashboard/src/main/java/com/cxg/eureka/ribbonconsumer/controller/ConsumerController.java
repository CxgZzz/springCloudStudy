package com.cxg.eureka.ribbonconsumer.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Date: 2020/5/6 19:40
 * Author: chen_xinggen
 * Description:
 */
@RestController
public class ConsumerController {
    @Autowired
    private RestTemplate restTemplate;
    @HystrixCommand(fallbackMethod = "defaultStores")
    @GetMapping(value = "/hello")
    public String hello(){
        return restTemplate.getForEntity("http://eureka-provider/",String.class).getBody();
    }

    public String defaultStores(){
        return "feign + hystrix Dashboard ,提供者服务挂了";
    }
}
