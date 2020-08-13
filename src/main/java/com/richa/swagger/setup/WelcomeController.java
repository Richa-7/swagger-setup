package com.richa.swagger.setup;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api")
public class WelcomeController {

	@GetMapping("/welcome")
	@ApiOperation(value="welcome to swagger setup",
		notes= "Give information about what API does",
		response=String.class)
	public String hello() {
		return "Welcome";
	}
	
	
	/*
	 * @ApiParam when we want to pass parameters to API add description in value
	 * about what that parameter is used for
	 * 
	 * @ApiModel and @ApiOperation used on DTO class and attributes respectively
	 */
}
