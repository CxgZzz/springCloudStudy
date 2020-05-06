package com.cxg.eureka.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class ProviderApplication {
    @RequestMapping("/")
    public String home(){
        return "hello world";
    }

    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class, args);
    }

}
