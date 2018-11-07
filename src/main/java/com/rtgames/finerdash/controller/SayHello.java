package com.rtgames.finerdash.controller;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class SayHello {

    @RequestMapping("/")
    String home() {
        return "Welcome to FinerDash! <hr> Check back in 5 years and you won'tbelieve your eyes :))))";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SayHello.class, args);
    }


}
