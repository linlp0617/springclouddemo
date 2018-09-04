package com.linlp.springcloud.helloworld.feign.client.service;

import org.springframework.stereotype.Component;

import com.linlp.springcloud.helloworld.feign.client.interfaces.HelloWorldService;

@Component
public class HelloWorldServiceFailure implements HelloWorldService {
    @Override
    public String sayHello() {
        System.out.println("hello world service is not available !");
        return "hello world service is not available !";
    }
}
