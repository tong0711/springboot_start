package com.landmaster.springboot;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
@Controller
@EnableAutoConfiguration
public class App  {

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World my frist for spring boot!";
    }

    public static void main(String[] args) throws Exception {
    	
        SpringApplication.run(App.class, args);
    }


}