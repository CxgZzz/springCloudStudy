package com.cxg.eureka.ribbonconsumer.service;

import com.cxg.eureka.ribbonconsumer.hystrix.HystrixClientFallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "eureka-provider",fallbackFactory = HystrixClientFallbackFactory.class)
public interface HomeClients {
    @GetMapping("/")
    String consumer();
}
