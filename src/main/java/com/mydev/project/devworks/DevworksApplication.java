package com.mydev.project.devworks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DevworksApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(DevworksApplication.class, args);
		
		for (String beanName : ctx.getBeanDefinitionNames()) {
			//System.out.println("bean:" + beanName);
		}
		
	}

}
