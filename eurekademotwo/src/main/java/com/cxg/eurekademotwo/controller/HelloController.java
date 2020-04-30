package com.cxg.eurekademotwo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Date: 2020/4/30 8:52
 * Author: chen_xinggen
 * Description: hello服务
 */
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name")String name){
        return "hello "+name+"  worlfd";
    }
}
