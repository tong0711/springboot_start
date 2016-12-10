package com.landmaster.springboot;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
@EnableAutoConfiguration
public class App  implements EmbeddedServletContainerCustomizer{

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World my frist!";
    }

    public static void main(String[] args) throws Exception {
    	
        SpringApplication.run(App.class, args);
    }

	public void customize(ConfigurableEmbeddedServletContainer arg0) {
		arg0.setPort(8081);
		// TODO Auto-generated method stub
		
	}
}