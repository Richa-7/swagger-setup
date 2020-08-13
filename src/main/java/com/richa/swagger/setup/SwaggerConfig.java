package com.richa.swagger.setup;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
    @Bean
    public Docket api() { 
        return new Docket(DocumentationType.SWAGGER_2)  
          .select()
          .apis(RequestHandlerSelectors.basePackage("com.richa.swagger.setup"))              
          .paths(PathSelectors.any())
          .build()
          .apiInfo(apiDetails());   
        
        //select method to get the builder object 
        //After setting the changes build is used
        //paths => for restricting api paths
        // api base package restricts from other packages for swagger
        //If I remove .api then Spring MVC mappings can also be seen in swagger
    }
    
    public ApiInfo apiDetails() {
    	return new ApiInfo(
    			"Swagger Setup and Customization",
    			"Sample api for learning",
    			"1.0",
    			"Free to use",
    			new Contact("Richa Chhabra", "https://github.com/", "richachhabra07@gmail.com"),
    			"API License",
    			"https://github.com/",
    			Collections.emptyList());
    			
    }
}
