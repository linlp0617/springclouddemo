package com.linlp.springcloud.helloworld.ribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class HelloService {
    @Autowired RestTemplate restTemplate;
    
    @HystrixCommand(fallbackMethod = "callServiceFailed")
    public String getHelloContent() {
        return restTemplate.getForObject("http://SERVICE-HELLOWORLD/",String.class);
    }
    
    public String callServiceFailed() {
    	return "now service is not available .";
    }
}
