package com.scorsaro.dockerdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {



    @GetMapping("/docker/hello")
    String hello (){
        return "Hello World from a Docker container";
    }

}
