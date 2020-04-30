package com.cxg.eurekaprivoder.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Date: 2020/4/30 15:38
 * Author: chen_xinggen
 * Description:
 */
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name")String name){
        return "hello "+name+"  worlfd";
    }
}
