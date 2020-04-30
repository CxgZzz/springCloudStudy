package com.cxg.eurekaprivoder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication

@EnableDiscoveryClient
public class EurekaprivoderApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaprivoderApplication.class, args);
    }

}
