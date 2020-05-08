package com.cxg.eureka.ribbonconsumer.hystrix;

import com.cxg.eureka.ribbonconsumer.service.HomeClients;
import feign.hystrix.FallbackFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.stereotype.Component;

@Component
public class HystrixClientFallbackFactory implements FallbackFactory<HomeClients> {
    @Override
    public HomeClients create(Throwable throwable) {
        return ()->"feign+hystrix,提供者服务挂了";
    }
}
