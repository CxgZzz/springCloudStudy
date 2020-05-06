package com.cxg.eureka.ribbonconsumer.controller;

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
    @GetMapping(value = "hello")
    public String hello(){
        return restTemplate.getForEntity("http://eureka-provider/",String.class).getBody();
    }
}
