package com.dubbo.controller;


import com.dubbo.HelloService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {

    @DubboReference
    HelloService helloService;


     @GetMapping("sayHello")
     public String sayHello() {
        String result= helloService.sayHello("sanmao");
         return "hello,"+result;
     }
}
