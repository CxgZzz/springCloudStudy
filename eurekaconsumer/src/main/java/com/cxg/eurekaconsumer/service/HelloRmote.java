package com.cxg.eurekaconsumer.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Date: 2020/4/30 9:18
 * Author: chen_xinggen
 * Description: 调用实现
 */
@FeignClient(name = "springcloudproducer")
public interface HelloRmote {
    @GetMapping(value = "/hello")
    public String hello(@RequestParam(value = "name")String name);
}
