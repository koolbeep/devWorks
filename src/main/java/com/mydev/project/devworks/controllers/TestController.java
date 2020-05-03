package com.mydev.project.devworks.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@RequestMapping("/")
	public String welcome() {
		return "Welcome to my test page, Jeff";
	}

}
