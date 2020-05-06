package com.cxg.eureka.provider;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class ProviderApplication {
    @Value("${server.port}")
    private String port;
    @RequestMapping("/")
    public String home(){
        return "hello 2world，"+port;
    }

    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class, args);
    }

}
