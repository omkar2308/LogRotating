package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoggingController {

    Logger log=LoggerFactory.getLogger(LoggingController.class);

    @GetMapping("/test/{name}")
    public String DemoLog(@PathVariable String name){
        log.debug("Request{}",name);
        if(name.equalsIgnoreCase("test")){
            throw new RuntimeException("opps exception raised");
        }
        String responce="hi "+name+" welcome to springboot web";
        log.debug("Respnce {}",responce);
        return responce;

    }

}
