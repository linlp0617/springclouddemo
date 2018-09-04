package com.linlp.springcloud.helloworld.feign.client.interfaces;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.linlp.springcloud.helloworld.feign.client.service.HelloWorldServiceFailure;

@FeignClient(value = "SERVICE-HELLOWORLD",fallback = HelloWorldServiceFailure.class)
public interface HelloWorldService {
    @RequestMapping(value = "/",method = RequestMethod.GET)
    String sayHello();
}
