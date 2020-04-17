package com.lwb.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/des")
public class UserController {
	@GetMapping("test")
	public String test() {
		return "This is a Test!";
	}
}
