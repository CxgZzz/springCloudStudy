package com.cxg.eureka.ribbonconsumer;

import org.apache.catalina.connector.Connector;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.embedded.tomcat.TomcatConnectorCustomizer;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


@EnableHystrix
@SpringBootApplication
@EnableDiscoveryClient
public class RibbonconsumerApplication {
    @LoadBalanced
    @Bean
    RestTemplate restTemplate(){
        return  new RestTemplate();
    }
    @Bean
    public TomcatServletWebServerFactory webServerFactory() {

        TomcatServletWebServerFactory factory = new TomcatServletWebServerFactory();

        factory.addConnectorCustomizers(new TomcatConnectorCustomizer() {

            @Override

            public void customize(Connector connector) {

                connector.setProperty("relaxedPathChars", "\"<>[\\]^`{_}");

                connector.setProperty("relaxedQueryChars", "\"<>[\\]^`{_}");

            }

        });

        return factory;

    }
    public static void main(String[] args) {
        SpringApplication.run(RibbonconsumerApplication.class, args);
    }

}
