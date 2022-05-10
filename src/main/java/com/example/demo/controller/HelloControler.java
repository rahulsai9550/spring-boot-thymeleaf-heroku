package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloControler {
	@RequestMapping("/")
	public String greet(Model model) {
		model.addAttribute("message","Hello World");
		return "helloworld";
	}
}
