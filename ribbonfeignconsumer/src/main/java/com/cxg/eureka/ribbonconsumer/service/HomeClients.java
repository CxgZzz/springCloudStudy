package com.cxg.eureka.ribbonconsumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("eureka-provider")
public interface HomeClients {
    @GetMapping("/")
    String consumer();
}
