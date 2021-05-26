package com.dubbo.config;

import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.ProtocolConfig;
import org.apache.dubbo.config.RegistryConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description 代替配置文件配置dubbo 启动类@EnableDubbo不能忘
 * @project
 * @author：hf
 * @date：
 */
@Configuration
public class DubboApi {

   @Bean
    public ApplicationConfig application(){

       ApplicationConfig application=new ApplicationConfig();
       application.setId("consumer");
      // application.setName("com.dubbo.controller");
       return application;
   }
   @Bean
   public RegistryConfig registryConfig(){
       RegistryConfig registryConfig=new RegistryConfig();
       registryConfig.setAddress("redis://127.0.0.1:6379");
       return registryConfig;
   }


}
