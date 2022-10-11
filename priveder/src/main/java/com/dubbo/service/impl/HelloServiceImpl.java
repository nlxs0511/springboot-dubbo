package com.dubbo.service.impl;

import com.dubbo.HelloService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Component
@DubboService
@RefreshScope
public class HelloServiceImpl implements HelloService {

    @Value("${user.name11}")
    private String userName;

    @Override
    public String sayHello(String name) {
        return "hello,"+name+",我nacos是配置中心数据:"+userName;
    }
}
