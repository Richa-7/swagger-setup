package com.richa.swagger.setup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
public class SwaggerSetupApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwaggerSetupApplication.class, args);
	}

}
