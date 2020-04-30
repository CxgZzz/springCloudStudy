package com.cxg.eurekaconsumer.controller;

import com.cxg.eurekaconsumer.service.HelloRmote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Date: 2020/4/30 9:20
 * Author: chen_xinggen
 * Description: 调用远程服务
 */
@RestController
public class ConsumerController {
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    HelloRmote helloRmote;

    @GetMapping(value = "/cloud")
    public String helloC(){
        //return restTemplate.getForEntity("http://localhost:9000/hello?name=12121",String.class).getBody();
    return helloRmote.hello("aadaaaa");
    }

}
