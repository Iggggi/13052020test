package com.test12052020.test12052020.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
        @RequestMapping("/")
        public String getHelloWorld(){
        return "Hello world";}
}
