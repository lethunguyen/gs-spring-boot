package com.example.springboot.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

@RestController
public class HelloController {

	@GetMapping("/")
	public String index() {
		return "index.html";
	}

	@GetMapping("/test")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		model.addAttribute("name", name);
		return "View/test.html";
	}

}
