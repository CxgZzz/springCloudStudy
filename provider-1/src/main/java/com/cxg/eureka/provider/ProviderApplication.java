package com.cxg.eureka.provider;

import org.apache.catalina.connector.Connector;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.embedded.tomcat.TomcatConnectorCustomizer;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController

public class ProviderApplication {

    @Value("${server.port}")
    private String port;
    @RequestMapping("/")
    public String home(){
        return "hello 1world,"+port;
    }

    @Bean
    public TomcatServletWebServerFactory webServerFactory() {

        TomcatServletWebServerFactory factory = new TomcatServletWebServerFactory();

        factory.addConnectorCustomizers(new TomcatConnectorCustomizer() {

            @Override

            public void customize(Connector connector) {
                connector.setAttribute("relaxedQueryChars", "_");
                connector.setAttribute("relaxedPathChars", "_");

            }

        });

        return factory;

    }

    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class, args);
    }

}
