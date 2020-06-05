package com.kfc.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/home")
public class UserController {

	@GetMapping("/login")
	public String index() {
		return "index";
	}
	
	
	
	@GetMapping("/userForm")
	public String userForm() {
		return "/user-form/user-view";
	}
	
	
}
