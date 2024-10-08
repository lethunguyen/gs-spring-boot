package com.example.springboot.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

@RestController
public class HelloController {

	@GetMapping("/")
	public String index() {
		return "index";
	}

	@GetMapping("/test")
	public String test(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		model.addAttribute("name", name);
		return "test";
	}

}
