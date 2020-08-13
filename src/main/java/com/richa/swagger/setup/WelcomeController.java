package com.richa.swagger.setup;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class WelcomeController {

	@GetMapping("/welcome")
	public String hello() {
		return "Welcome";
	}
}
